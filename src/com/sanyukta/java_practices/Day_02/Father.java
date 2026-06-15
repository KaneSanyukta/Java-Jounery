package com.sanyukta.java_practices.Day_02;

class Father {
    double bal;
    public void money(){
        bal = 100000.56;
    }
}
class Son extends Father{
    public void getMoney(){
        money();
        System.out.println("Acc Balance:"+bal);
    }
}