package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
public static void main(String[] args) {
	Random q=new Random();
	int z= q.nextInt(101);
	Random w=new Random();
	int x= w.nextInt(51);
	Random e=new Random();
	int c= e.nextInt(26);
	Random r=new Random();
	int v= r.nextInt(11);
	Random t=new Random();
	int b= t.nextInt(3);
	
	JOptionPane.showMessageDialog(null, "Enter 5 lottery numbers");
	String p=JOptionPane.showInputDialog("Enter a lottery number from 0 to 100");
	int l=Integer.parseInt(p);
	String o=JOptionPane.showInputDialog("Enter a lottery number from 0 to 50");
	int k=Integer.parseInt(o);
	String i=JOptionPane.showInputDialog("Enter a lottery number from 0 to 25");
	int j=Integer.parseInt(i);
	String u=JOptionPane.showInputDialog("Enter a lottery number from 0 to 10");
	int h=Integer.parseInt(u);
	String y=JOptionPane.showInputDialog("Enter a lottery number from 0 to 2");
	int g=Integer.parseInt(y);
	
	System.out.println(z);
	System.out.println(x);
	System.out.println(c);
	System.out.println(v);
	System.out.println(b);
	
  if(z==l) {JOptionPane.showMessageDialog(null, "Good job, you guessed a number!");}
  else {JOptionPane.showMessageDialog(null, "Sorry, your number was wrong");}
  if(x==k) {JOptionPane.showMessageDialog(null, "Good job, you guessed a number!");}
  else {JOptionPane.showMessageDialog(null, "Sorry, your number was wrong");}	
  if(c==j) {JOptionPane.showMessageDialog(null, "Good job, you guessed a number!");}
  else {JOptionPane.showMessageDialog(null, "Sorry, your number was wrong");}
  if(v==h) {JOptionPane.showMessageDialog(null, "Good job, you guessed a number!");}
  else {JOptionPane.showMessageDialog(null, "Sorry, your number was wrong");}
  if(b==g) {JOptionPane.showMessageDialog(null, "Good job, you guessed a number!");}
  else {JOptionPane.showMessageDialog(null, "Sorry, your number was wrong");}
  

	
	
}}
