package com.gagi.restful.error;

public class DepartmentNotFoundException extends Exception {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -3987901298544842205L;
	public DepartmentNotFoundException() {
	        super();
	    }
	 public DepartmentNotFoundException(String message) {
	        super(message);
	    }
	  public DepartmentNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	  public DepartmentNotFoundException(Throwable cause) {
	        super(cause);
	    }
	 protected DepartmentNotFoundException(String message, Throwable cause,
                boolean enableSuppression,
                boolean writableStackTrace) {
super(message, cause, enableSuppression, writableStackTrace);
}
}
