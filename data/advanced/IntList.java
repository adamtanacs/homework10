package data.advanced;

import java.util.ArrayList;

public class IntList {
    private int actualSize;
    private ArrayList<Integer> list;

    public IntList(int[] list) {
        this.list = new ArrayList<>();
        actualSize = list.length;
        for(int number : list) {
            this.list.add(number);
        }
    }

    public void add(int number) {
        list.add(number);
        actualSize++;
    }

    public void concat(IntList other) {
        for (int number : other.list) {
            list.add(number);
        }
        actualSize = list.size();
    };

    @Override
    public String toString() {
        if (actualSize != 0) {
            StringBuilder out = new StringBuilder();
            int i = 0;
            for(int numbers : list)
            {
                if (actualSize > i) {
                    String tmp = (i < actualSize - 1) ? (numbers + ",") : (numbers + "");
                    out.append(tmp);
                    i++;
                }
            }
            return out.toString();
        } else {
            return "empty";
        }
    }

    public void removeItemsGreaterThan(int limit) {
        int i = 0;
        ArrayList<Integer> deleteList = new ArrayList<>();
        for(int number : list) {
            if (number > limit) {
                deleteList.add(i);
                i--;
            }
            i++;
        }
        for(int index : deleteList) {
            list.remove(index);
        }
        actualSize = list.size();
    }

    public ArrayList<Integer> getData() {
        return new ArrayList<Integer>(list);
    }
}
