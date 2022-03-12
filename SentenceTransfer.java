package com.example.main.com.example.sentenceTransfer;

import com.example.main.com.example.sentenceTransfer.com.example.sums.Sums;
import com.example.main.com.example.sentenceTransfer.com.example.sums.com.example.block.Block;

import java.util.ArrayList;
import java.util.List;


public class SentenceTransfer {
    private static final int BLOCK_SIZE = 25;
    private static final char FIRST_LETTER = 'A';
    private String sourceString;

    public SentenceTransfer(String sourceString) {
        this.sourceString = sourceString;
    }

    //converting the English text to numbers followed by splitting the sentence into blocks of 25 numbers
    public String encode() {
        List<Block> blocks = getBlocks();
        Sums sums = new Sums(blocks.get(0));
        List<Integer> rList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            rList.add(sums.getSum(i));
        }
        for (int i = 1; i < blocks.size(); i++) {
            Sums currSums = new Sums(blocks.get(i));
            for (int j = 0; j < 5; j++) {
                rList.set(j, rList.get(j) + currSums.getSum(j));
            }
        }
        String result = "";
        for (int i = 0; i < 5; i++) {
            int code = rList.get(i) % 27; //mod 27 operation
            if (code < 26) {
                result += (char) (code + FIRST_LETTER);
            } else {
                result += " ";
            }
        }
        return result;
    }
    // getting blocks from Block.java
    private List<Block> getBlocks() {
        List<Block> blocks = new ArrayList<>();
        for (int i = 0; i < sourceString.length(); i += BLOCK_SIZE) {
            blocks.add(new Block(sourceString.substring(i, Math.min(i + BLOCK_SIZE, sourceString.length()))));
        }
        return blocks;
    }

}
