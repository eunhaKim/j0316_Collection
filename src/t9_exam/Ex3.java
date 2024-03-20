package t9_exam;

import java.util.TreeSet;

// Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오.(단, set계열 객체사용)
public class Ex3 {
	public static void main(String[] args) {
		TreeSet<Integer> vos = new TreeSet<>();
		int random;
		for(int i=0 ; i<6; i++) {
			random = (int)(Math.random()*45)+1; // 1~45까지
			if(!vos.contains(random)) vos.add(random);
			else i--;
		}
		
		System.out.println("Lotto 6개의 당첨번호: " + vos);
	}
}
