package com.example.main.com.example.sentenceTransfer.com.example.sums.com.example.block;

import java.util.ArrayList;
import java.util.List;

// Function that calculates the block size and if need adds a padding
public class Block {
    private List<Integer> list = new ArrayList<>();

    public Block(String part) {
        for (int i = 0; i < part.length(); i++) {
            int code = part.charAt(i) - 'a';
            list.add(code >= 0 ? code : 26);
        }
        for (int i = part.length(); i < 25; i++) {
            list.add(0);
        }
    }

    public int get(int id) {
        return list.get(id);
    }

}
