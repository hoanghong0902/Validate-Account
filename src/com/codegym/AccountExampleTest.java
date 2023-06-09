package com.codegym;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount){
            System.out.println("Account: " + account + " is valid: " + accountExample.validate(account));
        }
        for (String account : invalidAccount){
            System.out.println("Account: " + account + " is valid: " + accountExample.validate(account));
        }
    }
}