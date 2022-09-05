package Day7;

import javax.xml.transform.Templates;

public class Gambling {
	public static void main(String[] args) {
		int temp = 0;
		for (int i = 0; i < 20; i++) {
			int temp2 = gambling();
			temp = temp + temp2;
			if (temp2 == 150 ) {
				System.out.println("profit for day "+(i+1)+ " is $50" );
			}else {
				System.out.println("loss for day "+(i+1)+ " is $50" );
			}
		}
		System.out.println(temp);
		if (temp > 2000) {
			System.out.println("profit is "+(temp-2000) );
			System.out.println("will play next month");
		}else if (temp < 2000) {
			System.out.println("loss is "+(2000-temp));
			System.out.println("will not play for next month");
		}else {
			System.out.println("no win no loss");
		}
	}

	public static int gambling() {
		int endAmount = 100;
		while(endAmount > 50 && endAmount < 150) {
			int bet=0;
			int temp = (int) (Math.random()*10)%2;
			if (temp==1) {
				bet=1;
			}else {
				bet=-1;
			}
			endAmount = endAmount + bet;
		}
		return endAmount;
	}
}
