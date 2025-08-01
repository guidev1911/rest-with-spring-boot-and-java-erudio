package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BadRequestException extends RuntimeException {

    public BadRequestException(){
        super("Unsupported file extension!");
    }
    public BadRequestException(String message) { super(message); }
}
