package academic.system.person.exception;

public class ApiRequestException extends RuntimeException {

    public ApiRequestException( String message ) {
        super( message );
    }
}
