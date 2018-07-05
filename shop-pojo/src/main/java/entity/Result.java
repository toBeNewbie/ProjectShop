package entity;

import java.io.Serializable;

public class Result implements Serializable {
	
	//成功标记
	private boolean success;
	
	//返回的信息
	private String message;

	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
