package com.redhat.training.model;

import java.io.Serializable;

public class WorkorderResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4927952601379675826L;
	
	private Workorder workorder;
	
	private Status status;
	
	public enum Status {
		SUCCESS,FAILURE;
	}

	public Workorder getWorkorder() {
		return workorder;
	}

	public void setWorkorder(Workorder workorder) {
		this.workorder = workorder;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
