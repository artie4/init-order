package model;

public abstract class Base {

    protected static int total = -1;
    protected int id = -1;

    static {
        System.out.printf("[Base] static init block; total=%d \r\n", total);
    }

    {
        System.out.printf("[Base] init block; id=%d \r\n", id);
    }

    Base() {
        System.out.println("[Base] constructor \r\n");
    }

}
