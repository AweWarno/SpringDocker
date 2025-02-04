package ru.netology.springrest.advise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> InvalidCredentialsError(InvalidCredentials e) {
        return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> UnauthorizedUserError(UnauthorizedUser e) {
        System.out.println(e.toString());
        return new ResponseEntity<>(e.toString(), HttpStatus.UNAUTHORIZED);
    }


}
