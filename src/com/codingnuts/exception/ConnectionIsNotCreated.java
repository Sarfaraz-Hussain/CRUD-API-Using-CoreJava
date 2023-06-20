package com.codingnuts.exception;

public class ConnectionIsNotCreated extends RuntimeException {
    public ConnectionIsNotCreated(String msg) {
        super(msg);
    }
}
