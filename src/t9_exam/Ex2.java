package t9_exam;

import java.util.ArrayList;
import java.util.Comparator;

// Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오.(단, ArrayList객체사용)
public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<>();
		int random;
		for(int i=0 ; i<6; i++) {
			random = (int)(Math.random()*45)+1; // 1~45까지
			if(!vos.contains(random))	vos.add(random);
			else i--;
		}
		vos.sort(Comparator.naturalOrder()); // Comparator클래스를 이용한 오름차순 정렬
		System.out.println("Lotto 6개의 당첨번호 : " + vos);
	}
}
