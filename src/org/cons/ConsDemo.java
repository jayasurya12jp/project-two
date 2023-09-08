package org.cons;

public class ConsDemo {
    ConsDemo(){
    	System.out.println("defualt cons:"+ 1234);
    }
    public ConsDemo(String a) {
    	System.out.println("string:"+ "jaya");
    	
    }
    public static void main(String[] args) {
		ConsDemo c=new ConsDemo();
		ConsDemo c1=new ConsDemo("ed");
	}
}
