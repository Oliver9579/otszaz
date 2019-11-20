package hu.store.domain.service;

import java.util.Scanner;

public class Console {

    private final Scanner scanner;

    public Console(Scanner scanner) {
        this.scanner = scanner;
    }

    public  String read() {
        return scanner.next();

    }

    public int readInt() {
        return scanner.nextInt();
    }
}