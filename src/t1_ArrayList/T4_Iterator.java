package t1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class T4_Iterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<>();
		for(int i=0 ; i<10 ; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1. vos : " + vos);
		System.out.println();
		
		// 향상된 for문 = for ~ each문
		for(int vo :vos) System.out.print(vo+" ");
		
		System.out.println();
		while(true) {
			// 수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음기회에~~' 출력하시오
			System.out.print("수를 입력하세요? ");
			int num = sc.nextInt();
			boolean win = false;
			for(int vo : vos) if(vo == num) win=true;
			
			if(win) {
				System.out.println(num + " : 당첨\n");
				break;
			}
			else System.out.println(num + " : 꽝!");
		}
		
		// Iterator(반복지시자)로 vos 객체를 꺼내기
		Iterator<Integer> it = vos.iterator();
		System.out.println("2. it : " + it);
		while(it.hasNext()) { // hasMoreElement()
			int item = it.next(); // hasNext()
			System.out.print(item+" ");
		}
		System.out.println("\n");
		
		// 스트림(Stream)객체로 출력하기
		Stream<Integer> stream = vos.stream();
		stream.forEach(no -> System.out.print(no+" "));
		
		
		sc.close();
	}
}
