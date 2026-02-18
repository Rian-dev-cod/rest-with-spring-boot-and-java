package br.com.rian.eurudio.exeception.hadler;

import br.com.rian.eurudio.exeception.ExeceptionResponse;
import br.com.rian.eurudio.exeception.UnsupportedMathOperationExeception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomEntityResponseHandler extends ResponseEntityExceptionHandler {

@ExceptionHandler(Exception.class)
    public final ResponseEntity<ExeceptionResponse> handlerAllException(Exception ex, WebRequest request){
        ExeceptionResponse response = new ExeceptionResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsupportedMathOperationExeception.class)
    public final ResponseEntity<ExeceptionResponse> handlerBadRequestException(Exception ex, WebRequest request){
        ExeceptionResponse response = new ExeceptionResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
