public class GameCharacter{
	public String name;
	public double money;
	protected double[] amount = new double[8];

	void printPrologue() {};

	public void sellCoin(double num, int index, double cost_now) 
	{
		amount[index] -= num;
		money += num*cost_now;
	}
	
	public void buyCoin(double cost, int index, double cost_now) 
	{
		amount[index] += cost/cost_now;
		money -=cost;
	}
	
	public void printMoney(Coin[] coin)
	{
		int check=0;
		System.out.println("Remain Money : " + money);
		System.out.print("Owned coin : ");
		for(int i=0;i<coin.length;i++){
			if(amount[i]>0.0){
				if(check!=0)
					System.out.print("/ ");
				System.out.print(coin[i].name + " -> " + amount[i] + "ea ");
				check++;
				if(i==coin.length-1){
					break;
				}
			}
		}
	}
}
