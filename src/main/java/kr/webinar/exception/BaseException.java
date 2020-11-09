package kr.webinar.exception;

public class BaseException extends RuntimeException {
    private ErrorCode code;
    
    public BaseException(ErrorCode code, String message) {
        super(message);
        
        this.code = code;
    }
    
    public ErrorCode getErrorCode() {
        return this.code;
    }
}