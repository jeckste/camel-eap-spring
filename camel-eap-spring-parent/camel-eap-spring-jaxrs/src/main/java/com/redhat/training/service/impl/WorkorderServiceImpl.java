package com.redhat.training.service.impl;

import com.redhat.training.model.Workorder;
import com.redhat.training.model.WorkorderResponse;
import com.redhat.training.model.WorkorderResponse.Status;
import com.redhat.training.service.WorkorderService;

public class WorkorderServiceImpl implements WorkorderService {

	@Override
	public WorkorderResponse create(Workorder workorder) {
		WorkorderResponse workorderResponse = new WorkorderResponse();
		workorderResponse.setWorkorder(workorder);
		workorderResponse.setStatus(Status.SUCCESS);
		return workorderResponse;
	}

	@Override
	public Workorder retrieve(String accountNumber) {
		Workorder workorder = new Workorder();
		workorder.setAccountNumber(accountNumber);
		return workorder;
	}

	@Override
	public WorkorderResponse update(Workorder workorder) {
		WorkorderResponse workorderResponse = new WorkorderResponse();
		workorderResponse.setWorkorder(workorder);
		workorderResponse.setStatus(Status.SUCCESS);
		return workorderResponse;
	}

	@Override
	public WorkorderResponse delete(String accountNumber) {
		WorkorderResponse workorderResponse = new WorkorderResponse();
		Workorder workorder = new Workorder();
		workorder.setAccountNumber(accountNumber);
		workorderResponse.setWorkorder(workorder);
		workorderResponse.setStatus(Status.SUCCESS);
		return workorderResponse;
	}

	@Override
	public WorkorderResponse commit(String accountNumber) {
		WorkorderResponse workorderResponse = new WorkorderResponse();
		Workorder workorder = new Workorder();
		workorder.setAccountNumber(accountNumber);
		workorderResponse.setWorkorder(workorder);
		workorderResponse.setStatus(Status.SUCCESS);
		return workorderResponse;
	}

}
