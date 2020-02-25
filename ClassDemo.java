import java.util.Scanner;

public class ClassDemo {
	public static void main(String[] args) {


		//Add code to create an object repeatedly

		String name,ans;
		int[] age = new int[10];
		int i = 0;
		Person p;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter name :");
			name = input.nextLine();
			System.out.println("Enter age :");
			age[i] = input.nextInt();
			p = new Person(name,age[i],20);
			System.out.println(p.getName() + 
					" You are " +p.getAge() + " Years old");
			input.nextLine();
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
			i++;
		}while (ans.equals("y") && i < 10);
		for(i = 0; i < age.length; i++)
			if(age[i] != 0)
				System.out.print(age[i] + " ");

		input.close();
	}
}
