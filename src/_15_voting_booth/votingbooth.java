package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "See if you can vote");
	String x=JOptionPane.showInputDialog("How old are you?");
int y=Integer.parseInt(x);
if (y > 18) {JOptionPane.showMessageDialog(null, "You are old enough to vote!");}
else {JOptionPane.showMessageDialog(null, "You're are too yung 2 vote");}
}}