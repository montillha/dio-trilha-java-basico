package me_dio.spring_rest_api.controller.Exception;

import me_dio.spring_rest_api.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinesException(IllegalArgumentException businesException){
        return new ResponseEntity<>(businesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);

    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource ID not Found", HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
        var message = "Unexpected server error, see the logs";
        logger.error(message,unexpectedException);
        return new ResponseEntity<>("Unexpected server error, see the logs", HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
