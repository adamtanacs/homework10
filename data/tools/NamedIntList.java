package data.tools;

import data.advanced.IntList;

public class NamedIntList extends IntList{

    private String name;


    public NamedIntList(String name, int[] list) {
        super(list);
        this.name = name;
    }

    @Override
    public String toString() {
        String out = super.toString() + " - " + name;
        return out;
    }
}
