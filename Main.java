package com.example.main;

import com.example.main.com.example.sentenceTransfer.SentenceTransfer;

public class Main {
    public static void main(String[] args) {
        SentenceTransfer transfer = new SentenceTransfer("abc"); // Input English text to convert to Hash Values
        System.out.println(transfer.encode());
    }

}
