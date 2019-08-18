import java.util.Random;

import javax.swing.JOptionPane;

public class RandomPractice {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "iq is a measure of how smart you are");
JOptionPane.showMessageDialog(null, "The average iq is betweeen 90 and 110");
Random r=new Random();	
int n=r.nextInt(70);
Random z= new Random();
int x=z.nextInt(70);
ask();
JOptionPane.showMessageDialog(null, "Ok... your score so far is:"+n);
int a=(n+=x);
askthirdtime();
JOptionPane.showMessageDialog(null, "Your score is:" +a);
if(a>110) {
	JOptionPane.showMessageDialog(null, "Congrats, you have an abovw average iq!");}
if(a<90) {JOptionPane.showMessageDialog(null, "Sorry, your iq is below average.");}
if(a>90&&a<110) {JOptionPane.showMessageDialog(null, "You have an average iq. Hey, it could be worse, right?");}

}
static void ask() {
	String one=JOptionPane.showInputDialog("Do you want to take an iq test?(Yes or No");
	if (one.equals("Yes")) {
		askagain();
	}
	else {JOptionPane.showMessageDialog(null, "Congratulations, you didn't waste your time. HIGH IQ");}
}

static void askagain() {
	String two=JOptionPane.showInputDialog("Would you consider yourself smart?(Yes or No");
}
static void askthirdtime() {
	String three=JOptionPane.showInputDialog(null, "Imagine that you're in a room with no windows or doors.You have a mirror and a wooden table. How do you get out?");
	JOptionPane.showMessageDialog(null, "Hmmm. An interesting answer to be sure... Calculating your score");
}
}