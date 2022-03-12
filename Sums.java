package com.example.main.com.example.sentenceTransfer.com.example.sums;

import com.example.main.com.example.sentenceTransfer.com.example.sums.com.example.block.Block;

import java.util.ArrayList;
import java.util.List;

public class Sums {
    private Block block;
    private List<Integer> sumList = new ArrayList<>();

    public Sums(Block block) {
        this.block = block;
        calculate();
    }
    // 3 rounds simplified into 1 general round
    private void calculate() {
        sumList.add(2 * getNum(1) + 2 * getNum(6) + 2 * getNum(11) + 2 * getNum(16) + 3 * getNum(21)
                + getNum(2) + getNum(8) + getNum(14) + getNum(20));
        sumList.add(2 * getNum(2) + 2 * getNum(7) + 3 * getNum(22) + 2 * getNum(17) + 2 * getNum(12)
                + getNum(3) + getNum(9) + getNum(15) + getNum(16));
        sumList.add(2 * getNum(3) + 2 * getNum(8) + 2 * getNum(13) + 2 * getNum(18) + 3 * getNum(23)
                + getNum(4) + getNum(10) + getNum(11) + getNum(17));
        sumList.add(2 * getNum(4) + 2 * getNum(9) + 2 * getNum(14) + 2 * getNum(19) + 3 * getNum(24)
                + getNum(5) + getNum(6) + getNum(12) + getNum(18));
        sumList.add(2 * getNum(5) + 2 * getNum(10) + 2 * getNum(15) + 2 * getNum(20) + 3 * getNum(25)
                + getNum(1) + getNum(7) + getNum(13) + getNum(19));
    }

    private int getNum(int id) {
        return Integer.parseInt("" + block.get(id - 1));
    }

    public int getSum(int id) {
        return sumList.get(id);
    }

}
