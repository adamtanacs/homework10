package data.main;
import data.tools.IntListBasic;
import data.tools.NamedIntList;
import data.advanced.IntList;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        IntListBasic testIntListBasic = new IntListBasic(10);
        System.out.println(testIntListBasic.toString());

        testIntListBasic.add(2);
        testIntListBasic.add(4);
        testIntListBasic.add(6);
        System.out.println(testIntListBasic.toString());

        testIntListBasic.add(1);
        testIntListBasic.add(3);
        testIntListBasic.add(4);
        System.out.println(testIntListBasic.toString());

        testIntListBasic.removeItemsGreaterThan(3);
        System.out.println(testIntListBasic.toString());

        IntListBasic testIntListBasicConcat = new IntListBasic(6);
        testIntListBasicConcat.add(2);
        testIntListBasicConcat.add(9);
        testIntListBasic.concat(testIntListBasicConcat);
        System.out.println(testIntListBasic.toString());

        testIntListBasicConcat.add(11);
        testIntListBasicConcat.add(13);
        testIntListBasic.concat(testIntListBasicConcat);
        System.out.println(testIntListBasic.toString());

        testIntListBasicConcat.add(21);
        testIntListBasicConcat.add(43);
        try {
            testIntListBasic.concat(testIntListBasicConcat);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }

        try {
            testIntListBasic.add(22);
            testIntListBasic.add(23);
            testIntListBasic.add(24);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }



        IntList testIntList = new IntList(new int[] {});
        System.out.println(testIntList.toString());

        testIntList.add(2);
        testIntList.add(4);
        testIntList.add(6);
        testIntList.add(1);
        testIntList.add(3);
        testIntList.add(4);
        System.out.println(testIntList.toString());

        testIntList.removeItemsGreaterThan(3);
        System.out.println(testIntList.toString());

        IntList testIntListConcat = new IntList(new int[] {2,9});
        testIntList.concat(testIntListConcat);
        System.out.println(testIntList.toString());

        testIntListConcat.add(11);
        testIntListConcat.add(13);
        testIntList.concat(testIntListConcat);
        System.out.println(testIntList.toString());

        ArrayList<Integer> testGetData = testIntList.getData();
        System.out.println(testGetData);



        NamedIntList testNamedList = new NamedIntList("TestNameList", new int[] {});
        System.out.println(testNamedList.toString());

        testNamedList.add(2);
        testNamedList.add(4);
        testNamedList.add(6);
        System.out.println(testNamedList.toString());

        testNamedList.add(1);
        testNamedList.add(3);
        testNamedList.add(4);
        System.out.println(testNamedList.toString());

        testNamedList.removeItemsGreaterThan(3);
        System.out.println(testNamedList.toString());

        NamedIntList testNamedIntListConcat = new NamedIntList("testNamedIntListConcat", new int[] {2,9});
        testNamedList.concat(testNamedIntListConcat);
        System.out.println(testNamedList.toString());

        testNamedIntListConcat.add(11);
        testNamedIntListConcat.add(13);
        testNamedList.concat(testNamedIntListConcat);
        System.out.println(testNamedList.toString());

        NamedIntList testNamedIntListWithOnlyName = new NamedIntList("testNamedIntListWithOnlyName");
        System.out.println(testNamedIntListWithOnlyName.toString());
    }
}