package t9_exam;

import java.util.ArrayList;
import java.util.Comparator;

// max, min / sort / search / merge / 통계(누적)
/* 정렬문제 
   10개의 난수(10~100)를 발생시켜서 ArrayList객체에 저장시킨후 
  원본/오름차순정렬/내림차순정렬 자료를 출력하싱(ArrayList객체를 이용)
*/

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<>();
		
		for(int i=0 ; i<10; i++) vos.add((int)(Math.random()*91)+10);
		
		System.out.println("난수 10개 원본 : " + vos);
		vos.sort(Comparator.naturalOrder()); // Comparator클래스를 이용한 오름차순 정렬
		System.out.println("난수 10개 오름차순정렬 : " + vos);
		vos.sort(Comparator.reverseOrder()); // Comparator클래스를 이용한 내림차순 정렬
		System.out.println("난수 10개 내림차순정렬 : " + vos);
		
	}
}
