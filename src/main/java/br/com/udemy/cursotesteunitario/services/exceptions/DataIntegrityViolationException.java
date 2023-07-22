package br.com.udemy.cursotesteunitario.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException{
    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
