4)


        double wages;
        double hours;
        double rate;
        
        if (hours > 40){
          wages = 40 * rate + (hours - 40) * 1.5 * rate;
          return wages;
        }
        
        else (hours < 40) {
          wages = 40 * rate;
          return wages;
        }
        
        Then test this code afterward by putting it in a program and using a main method. 
        
14)

        if (avg < 60) {
            grade = 'F';
        else if (avg < 70) {
            grade = 'D';
        else if (avg < 80) {
            grade = 'C';
        else if (avg < 90) {
            grade = 'B';
        else {
            grade = 'A';
        }
        
16)


import java.awt.*;
import java.util.Scanner;

public class OrderTotal {
	
	public static double getOrderTotal (int bp, int nb){
		
		double total = bp * 18.95 + nb * 21.95;
		
		if (bp == 0 || nb == 0 || bp == 2 && nb == 0  || nb == 2 && bp == 0) {
		  return total;
		}
		else if (bp == 1 && nb == 1) {
			return 37.95;
		}
		else if (bp >= 12 || nb >= 12) {
			return 14.00 * nb + bp * 14.00;
		}
		else {
				return bp * 15.95 + nb * 15.95;
		}
	}
	
	public static void main(String args[]){
		System.out.print("Enter the number of Be Prepared books you want: ");
		Scanner keyboard = new Scanner (System.in);
		int n = keyboard.nextInt();
		System.out.print("Enter the number of Next Best books you want: ");
		Scanner keyboard1 = new Scanner (System.in);
		int b = keyboard1.nextInt();
		OrderTotal calculator = new OrderTotal();
		System.out.println(calculator.getOrderTotal(n,b));
		
	}
}




    
