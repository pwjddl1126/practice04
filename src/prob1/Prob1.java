package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int sum = 0;

		if(inputNumber%2 ==0){
			for(int i=1; i<=inputNumber; i++){
				if(i%2==0){
					sum += i;
				}
			}
		}else{
			for(int i=1; i<=inputNumber; i++){
				if(i%2==1){
					sum += i;
				}
			}
		}
		
		System.out.println("결과 값 : "+sum);
		
		scanner.close();
	}

}
