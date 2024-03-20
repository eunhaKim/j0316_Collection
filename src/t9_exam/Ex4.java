package t9_exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

/*
  	그린중학교 1반에서 3반의 명단이 다음과 같다.
  	이때 ArrayList에 각 반별로 저장시켜놓고, ArrayList에 저장된 각 반의 자료를 출력시켜보자.
  	또, 반 입력하면 그 반의 학생들을 출력시켜보시오.
  	1반 : 홍길동, 김말숙, 이기자
  	2반 : 소나무, 대나무 ,감나무, 밤나무
  	3반 : 오사랑, 하나로, 행복해
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String[]> vos = new ArrayList<>();
		String[][] classArr= {
				{"홍길동", "김말숙", "이기자"},
				{"소나무", "대나무" ,"감나무", "밤나무"},
				{"오사랑", "하나로", "행복해"}
		};
		for(String[] arr : classArr) vos.add(arr);
		for(int i=0 ; i<vos.size() ; i++) { // 각반 자료 출력
			System.out.print((i+1)+"반 : ");
			for(int j=0 ; j<vos.get(i).length ; j++) {
				System.out.print(vos.get(i)[j] + " ");
			}
			System.out.println();
		}
		while(true) {		
			System.out.println("반을 입력해주세요(1,2,3반만 가능합니다. 종료: -999) : "); // 입력된반 출력
			int classNum = sc.nextInt();
			if(classNum == -999) break;
			else if(classNum>0 & classNum<4) {
				System.out.println("----------------------------");
				System.out.print(classNum+"반 : ");
				for(int i=0 ; i<vos.get(classNum-1).length ; i++) {
					System.out.print(vos.get(classNum-1)[i] + " ");
				}
				System.out.println("\n----------------------------");
			}
			else System.out.println("1,2,3반만 가능합니다. 다시해주세요.");
		}
		System.out.println("종료");
		
		sc.close();
	}
}
