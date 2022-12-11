package com.deva.demo.error;



public class DepartmentNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public DepartmentNotFoundException(Throwable cause) {
		super(cause);
	}
	
	public DepartmentNotFoundException(String msg ,Throwable cause) {
		super(msg, cause);
	}

	public DepartmentNotFoundException(String cause) {
		super(cause);
	}
	
}
