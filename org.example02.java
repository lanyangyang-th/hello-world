package org.example;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //以上案例说明了变量可以重新赋值的特点。
        int x=100;//定义int变量x，并赋予初始值100；
        System.out.println(x);//输出变量的值，观察输出值
        x =300;//重新赋值为200；
        System.out.println(x);//输出变量的值，观察输出值

        //变量的第二个特点重新赋值给其他变量
        int n=100;
        System.out.println("n = "+n);
        n = 200;
        System.out.println("n = "+n);
        int c = n;
        System.out.println("x ="+n);
        c = c + 100;
        System.out.println("x = " + x);
        System.out.println("n + " + n);
    }
}
