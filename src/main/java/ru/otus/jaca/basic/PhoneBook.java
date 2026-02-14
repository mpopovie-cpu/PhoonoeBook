package ru.otus.jaca.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>());
        }
        book.get(name).add(phone);
    }

    public ArrayList<String> find(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return new ArrayList<>();
    }

    public String findFormatted(String name) {
        if (!book.containsKey(name)) {
            return name + ": not found";
        }
        return name + ": " + String.join(", ", book.get(name));
    }

    public boolean containsPhoneNumber(String phone) {
        for (ArrayList<String> phones : book.values()) {
            if (phones.contains(phone)) {
                return true;
            }
        }
        return false;
    }
}
