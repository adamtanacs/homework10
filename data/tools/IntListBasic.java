package data.tools;

import java.util.ArrayList;

public class IntListBasic{
    private int actualSize;
    private int maxSize;
    private int[] list;

    public IntListBasic(int maxSize) {
        this.maxSize = maxSize;
        this.list = new int[maxSize];
        actualSize = 0;
    }

    public void add(int number) {
        if (actualSize != maxSize) {
            list[actualSize] = number;
            actualSize++;
        } else {
            throw new IllegalArgumentException("IntListBasic is full!");
        }
    }

    public void concat(IntListBasic other) {
        for (int numbers : list) {

        }
    }

    public String toString() {
        if (actualSize == 0) {
            return "empty";
        } else {
            StringBuilder output = new StringBuilder();
            int i = 0;
            for (int numbers : list) {
                if (actualSize > i) {
                    String tmp = (i < actualSize-1) ? (numbers + ",") : (numbers + "");
                    output.append(tmp);
                    i++;
                }
            }
            return output.toString();
        }
    }

    public void removeItemsGreaterThan(int limit) 
    {
        for (int numbers : list) {
            
        }

    }
}