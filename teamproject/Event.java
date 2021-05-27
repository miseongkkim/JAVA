public class Event{
    
    private double FirstCapitalStock;
    private Boolean Execute=false;

    public Event(){}

    public Event(double FirstCapitalStock){
        this.FirstCapitalStock = FirstCapitalStock;
    }

    public void ExecuteEvent(){
	int choice=(int)(Math.random()*6);

	if(choice==4)
		this.Execute = true;
	else
		this.Execute = false;
    }

    public void MoneyUpDownEvent(GameCharacter cha){
        int choice = (int)(Math.random()*2);
        if(cha instanceof Student){
		if(this.Execute==true&&choice==1){
            	System.out.println("I recieved pocket money! (money +20)");
     		cha.money += 20;
        	}
            if(this.Execute==true&&choice==0){
            	System.out.println("I lost money on the road.. (money -10)");
            	cha.money -= 10;
            }
            this.Execute = false;
        }
        if(cha instanceof Employee){
            if(this.Execute==true&&choice==1){
            	System.out.print("I recieved Incentive! (money +100)");
	            cha.money += 100;
            }
            if(this.Execute==true&&choice==0){
           		System.out.print("I paid monthly rent... (money -50)");
	            cha.money -= 50;
            }
            this.Execute = false;
        }
        if(cha instanceof BuildingOwner){
            if(this.Execute==true&&choice==1){
            	System.out.print("I recieved monthly rent! (money +500)");
            	cha.money += 500;
            }
            if(this.Execute==true&&choice==0){
           		System.out.print("I paid repair fee & tax.. (money -250)");
          		cha.money -= 250;
            }
            this.Execute = false;
        }
    }

    public void Ending(GameCharacter cha){
        System.out.println("Your remained money : " + cha.money + " Your first money : " + this.FirstCapitalStock);
        if(cha instanceof Student){
	if(cha.money >= this.FirstCapitalStock*2){
            	System.out.print("Big Success! You earn more than tuition!");
        	}
        	else if(cha.money >= this.FirstCapitalStock*1.3){
            	System.out.print("Success! You can buy iPad!");
        	}
        	else if(cha.money >= this.FirstCapitalStock){
            	System.out.print("I didn't lose.. - SoSo");
        	}
        	else if(cha.money >= this.FirstCapitalStock*0.7){
            	System.out.print("It's OK... I have to work part-time. - Fail");
        	}
        	else{
            	System.out.print("I almost all lost.. - What the hell!");
        	}
        }
        if(cha instanceof Employee){
            if(cha.money >= this.FirstCapitalStock*2){
            	System.out.print("Big Success! You earn more than salary!");
        	}
        	else if(cha.money >= this.FirstCapitalStock*1.3){
           		System.out.print("Success! You can buy luxury!");
        	}
        	else if(cha.money >= this.FirstCapitalStock){
            	System.out.print("I didn't lose.. - SoSo");
        	}
        	else if(cha.money >= this.FirstCapitalStock*0.7){
            	System.out.print("It's OK... I have to work over night. - Fail");
        	}
        	else{
            	System.out.print("I almost all lost.. - What the hell!");
        	}
        }
        if(cha instanceof BuildingOwner){
            if(cha.money >= this.FirstCapitalStock*2){
            	System.out.print("Big Success! You earn more than Gangnam building!");
        	}
        	else if(cha.money >= this.FirstCapitalStock*1.3){
            	System.out.print("Success! You can buy car!");
        	}
        	else if(cha.money >= this.FirstCapitalStock){
            	System.out.print("I didn't lose.. - SoSo");
        	}
        	else if(cha.money >= this.FirstCapitalStock*0.7){
            	System.out.print("It's OK... I have to raise the monthly rent. - Fail");
        	}
        	else{
            	System.out.print("I almost all lost.. - What the hell!");
        	}
    }
}
}
