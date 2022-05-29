package model;

public class Concrete extends Audit {

    private String data = "empty";

    {
        System.out.printf("[Concrete] init block; data=%s \r\n", data);
    }

    static {
        System.out.printf("[Concrete] static init block; total=%d \r\n", total);
        System.out.println();
    }

    public Concrete(String data) {
        System.out.printf("[Concrete] constructor; data=%s \r\n", this.data);
        this.data = data;
    }

}
