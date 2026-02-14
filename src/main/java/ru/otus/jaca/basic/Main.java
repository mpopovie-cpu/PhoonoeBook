package ru.otus.jaca.basic;

public class Main {
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        pb.add("Ivanov", "123");
        pb.add("Ivanov", "456");
        pb.add("Petrov", "999");

        System.out.println(pb.findFormatted("Ivanov"));
        System.out.println(pb.findFormatted("Petrov"));
        System.out.println(pb.findFormatted("Sidorov"));
    }
}
