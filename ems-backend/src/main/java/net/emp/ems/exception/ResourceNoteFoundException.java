package net.emp.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNoteFoundException extends RuntimeException {

    public ResourceNoteFoundException(String message){
        super(message);
    }

}
