import data.tools.IntListBasic;

public class Console {
    public static void main(String[] args) {
        IntListBasic test = new IntListBasic(5);
        test.add(2);
        test.add(4);
        test.add(6);
        System.out.println(test.toString());
        test.add(1);
        test.add(3);
        System.out.println(test.toString());
    }
}