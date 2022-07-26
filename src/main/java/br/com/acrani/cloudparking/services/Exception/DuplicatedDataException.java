package br.com.acrani.cloudparking.services.Exception;

public class DuplicatedDataException extends RuntimeException{

    public DuplicatedDataException(String message) {
        super("message");
    }
}
