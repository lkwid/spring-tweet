package master_spring_mvc.error;

@SuppressWarnings("serial")
public class EntityNotFoundException extends Exception {
	public EntityNotFoundException(String message) {
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}