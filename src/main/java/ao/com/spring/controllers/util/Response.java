package ao.com.spring.controllers.util;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	private T data;
	private List<String> errors;
	
	public Response(T data){
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public List<String> getErrors() {
		if (errors == null)
			errors = new ArrayList<>();
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
