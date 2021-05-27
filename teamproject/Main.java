import java.io.*;
import java.util.Scanner;
public class Main{
	public static void main(String args[]) throws Exception{
		File file = new File("input.txt");
		Scanner scan = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		Coin[] coin = new Coin[8];
		Event event=new Event();
		int activeChoice;
		int characterChoice;
		double cost;
		double num;
		int wantToBuy;
		GameCharacter cha = new GameCharacter();
		int index=0;

		int i=0;
		while(scan.hasNext()){
			String name = scan.next();
			double cost_now = scan.nextDouble();
			String percent = scan.next();
			coin[i] = new Coin(name, cost_now, percent);
			i++;
		}
		
		while(true) {
			System.out.print("Which character do you want to play? 1. Student 2. Salary Man 3. YoungnRich : ");
			characterChoice = sc.nextInt();
			
			if(characterChoice == 1 || characterChoice == 2 || characterChoice == 3) {
				switch(characterChoice){
					case 1 : cha=new Student(); 
							event = new Event(cha.money);
							cha.printPrologue();
							break;
					case 2 : cha=new Employee(); 
							event = new Event(cha.money);
							cha.printPrologue();
							break;
					case 3 : cha=new BuildingOwner(); 
							event = new Event(cha.money);
							cha.printPrologue();
							break;
				}
				break;
			}
			else 
			{
				System.out.print("You can choice Only 1 Or 2 Or 3.");
				continue;
			}
		}
		

		for(int k=0;k<10;k++){
			System.out.println("<D-" + (10-k) + ">");
			System.out.println("********************************************");	
			System.out.println("*          Coin Present Condition          *");
			System.out.println("********************************************");
			for(int j=0;j<i-1;j++){	
				coin[j].printCoin(coin[j]);
			}
			System.out.println("********************************************");
			System.out.print("Select 1. Buy 2. Sell 3. Stay : ");
			activeChoice = sc.nextInt();
			switch(activeChoice){
				case 1 :  System.out.print("How much do you want to buy? : ");
					cost = sc.nextDouble();
					System.out.print("Which coin do you want to buy?(1.Emusk 2.bit 3.dodge 4.ETH 5.ETHClassic 6.Gold 7.Silver) : ");
					wantToBuy = sc.nextInt();
					cha.buyCoin(cost,wantToBuy-1,coin[wantToBuy-1].cost_now);
					cha.printMoney(coin);
					break;
				case 2 : System.out.print("How many do you want to sell? : ");
					num = sc.nextDouble();
					System.out.print("Which coin do you want to sell?(1.Emusk 2.bit 3.dodge 4.ETH 5.ETHClassic 6.Gold 7.Silver) : ");
					wantToBuy = sc.nextInt();
					cha.sellCoin(num,wantToBuy-1,coin[wantToBuy-1].cost_now);
					cha.printMoney(coin);
					break;
				case 3 : break;
			}
			for(int j=0;j<i-1;j++){	
				coin[j].upDownPercent(coin[j]);
			}
			event.ExecuteEvent();
			event.MoneyUpDownEvent(cha);
			System.out.println("");
		}
		
		event.Ending(cha);
		System.exit(0);
	}
}
