package com.redhat.training.camel.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class WorkorderRB extends RouteBuilder {

	private static final Logger LOG = LoggerFactory.getLogger(WorkorderRB.class);
	
	@Override
	public void configure() throws Exception {
				
		from("cxfrs://bean://rsServer?"
				+ "resourceClasses=com.redhat.training.service.WorkorderService"
				+ "&providers=#providers")
		//
		.choice()
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo("create"))
		.beanRef("workorderServiceImpl", "create")
		//
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo("retrieve"))
		.beanRef("workorderServiceImpl", "retrieve")
		//
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo("update"))
		.beanRef("workorderServiceImpl", "update")
		//
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo("delete"))
		.beanRef("workorderServiceImpl", "delete")
		//
		.when(header(CxfConstants.OPERATION_NAME).isEqualTo("commit"))
		.beanRef("workorderServiceImpl", "commit")
		//
		.otherwise().log(LoggingLevel.ERROR, "Unsupported Operation: " + header(CxfConstants.OPERATION_NAME));
	}

}
