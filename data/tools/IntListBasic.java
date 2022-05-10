package data.tools;

public class IntListBasic {
    private int actualSize;
    private int maxSize;
    private int[] list;

    private int pushAllElementsBack(int index,int limit) {
        for(int i = index; i < actualSize; i++) {
            list[i] = list [i+1];
        }
        return 0;
    }

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
            throw new IllegalStateException("IntListBasic is full!");
        }
    }

    public void concat(IntListBasic other) {
        if (other.actualSize + actualSize <= maxSize) {
            int j = 0;
            int i = actualSize;
            int tmp = other.actualSize;
            while(i < maxSize && j < tmp) {
                list[i] = other.list[j];
                i++;
                j++;
                actualSize++;
            }
        } else {
            throw new IllegalStateException("Exceeding max size of IntListBasic!");
        }
    }

    @Override
    public String toString() {
        if (actualSize == 0) {
            return "empty";
        } else {
            StringBuilder output = new StringBuilder();
            int i = 0;
            for (int numbers : list) {
                if (actualSize > i) {
                    String tmp = (i < actualSize - 1) ? (numbers + ",") : (numbers + "");
                    output.append(tmp);
                    i++;
                }
            }
            return output.toString();
        }
    }

    public void removeItemsGreaterThan(int limit) {
        for (int i = 0; i < actualSize;i++) {
            if (list[i] > limit) {
                pushAllElementsBack(i,limit);
                i--;
                actualSize--;
            }
        }
    }
}