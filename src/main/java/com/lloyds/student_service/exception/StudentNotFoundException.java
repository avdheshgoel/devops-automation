package com.lloyds.student_service.exception;

public class StudentNotFoundException extends Exception{

    private static final long serialVersionUID = -4847377249947206599L;

    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}