package com.clguo.maintest;

public class PrintN {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        print2(20000);
        //print1(100000);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - starTime) + "hao秒");

    }

    public static void print1(int N) {
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
    }

    public static void print2(int N) {
        if (N != 0) {
            print2(N -1);
            System.out.println("============");
            System.out.print(N);
        }
    }

}
