public class Student extends GameCharacter {

	public Student() {
		this.name = "Student";
		money = 10000.0;
	}
	
	@Override
	void printPrologue() {
		
		try {
			System.out.println("<--Prologue-->");
			System.out.println("부모님께 등록금으로 쓰라고 받은 230만원을 다 써버렸어...");
			Thread.sleep(1000);
			System.out.println("등록금 납부일이 10일밖에 남지 않았는데...안되겠어");
			Thread.sleep(1000);
			System.out.println("누구는 이번에 코인으로 돈 벌어서 차 샀다던데...");
			Thread.sleep(1000);
			System.out.println("생활비 대출 100만원으로 부모님께 들키지 않고 등록금을 내야겠어!!");
			Thread.sleep(1000);
			for (int i = 0; i < 3; i++) {
				System.out.println(".");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
