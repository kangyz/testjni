package com.alex;

public class TestDivide {

    public static void main(String[] args) {
        int a = 11;
        int b = 12;

        ParamIn paramIn = new ParamIn();
        paramIn.a.set(a);
        paramIn.b.set(b);
        ParamOut out = new ParamOut();
        Divide.divide(paramIn.address(),out.address());
        System.out.println(out.result);
    }
}
