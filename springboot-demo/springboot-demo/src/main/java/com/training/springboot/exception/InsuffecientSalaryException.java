package com.training.springboot.exception;

public class InsuffecientSalaryException extends RuntimeException{
    public InsuffecientSalaryException(String message) {
        super(message);
    }

}
