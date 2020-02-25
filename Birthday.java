import javax.swing.JOptionPane;
import java.util.Random;

public class Birthday {
	public static void main(String[] args) {

		String name, answer;
		double sum = 0.0;
		Random rand = new Random();
		
		Toy toy = new Toy();

		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company\n to choose gifts for young children");

		do {
			answer = "";
			do {
				name = JOptionPane.showInputDialog("Enter the name of the child");
				toy.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old is the child?")));
				
				do {
					toy.setToy(JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book"));
					
					if (!toy.getToy().equalsIgnoreCase("plushie") && !toy.getToy().equalsIgnoreCase("blocks") && !toy.getToy().equalsIgnoreCase("book"))
						JOptionPane.showMessageDialog(null, "Invalid choice\nPlease choose again");
				} while (!toy.getToy().equalsIgnoreCase("plushie") && !toy.getToy().equalsIgnoreCase("blocks") && !toy.getToy().equalsIgnoreCase("book"));
				
				toy.setCost(toy.getToy());

				if(!toy.ageOK())
					answer = JOptionPane.showInputDialog("Toy is not age appropriate\nDo you want another toy?");
			} while (answer.equalsIgnoreCase("yes"));

			answer = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			toy.addCard(answer);
			answer = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			toy.addBalloon(answer);
			
			sum += toy.getCost();

			JOptionPane.showMessageDialog(null, "The gift for " + name + toy.toString());

			answer = JOptionPane.showInputDialog("Do you want another toy? Yes or No");

		} while (answer.equalsIgnoreCase("yes"));
		
		JOptionPane.showMessageDialog(null, "The total cost of the order is $" + sum);
		JOptionPane.showMessageDialog(null, "Order number is " + (rand.nextInt(99999) + 1) + "\nProgrammer: Justin Hixson");
	}
}
