package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1_Basic {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList<>();
//		List<String> arrayList = new ArrayList<>(20); // 용량을 20으로 준다. 안주면 기본용량 (10)
		List<String> arrayList = new ArrayList<>();
		
		System.out.println("1. arrayList 크기 : " + arrayList.size()); 
		System.out.println("1. toString : " + arrayList.toString()); 
		System.out.println("1. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		//자료추가(add)
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong Kil Dong");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		
		arrayList.add("홍길동"); // 인덱스가 있어서 중복 허용됨!!
		System.out.println("2. arrayList 크기 : " + arrayList.size());  
		System.out.println("2. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// 특정위치(인덱스)에 자료 추가? .add(인덱스, 자료)
		arrayList.add(2,"소나무");
		System.out.println("3. arrayList 크기 : " + arrayList.size());  
		System.out.println("3. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// 검색: .get(인덱스)
		String name = arrayList.get(2);
		System.out.println("4. name : " + name);
		
		// 변경 : set(인덱스, 자료)
		arrayList.set(2, "감나무");
		System.out.println("5. arrayList 크기 : " + arrayList.size());  
		System.out.println("5. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// 삭제 : remove(인덱스) or remove("값") 
		arrayList.remove(2);
		arrayList.remove("홍길동"); // 순차구조라 앞에꺼 하나만 지워짐
		System.out.println("6. arrayList 크기 : " + arrayList.size());  
		System.out.println("6. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		List<Integer> arrList2 = new ArrayList<>();
		arrList2.add(0);
		for(int i=1 ; i<=5 ; i++)arrList2.add(i,i*100);
		System.out.println("7. arrayList 크기 : " + arrList2.size());  
		System.out.println("7. toString : " + arrList2); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// arrayList.remove(200); // 인덱스로 봐서 에러남!! 객체를 넣어야함!!
		arrList2.remove(new Integer(200)); // 인덱스로 봐서 에러남!! 객체를 넣어야함!!
		System.out.println("8. arrayList 크기 : " + arrList2.size());  
		System.out.println("8. toString : " + arrList2); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// 향상된 for문을 이용한 ArrayList객체의 활용
		String str = "";
		for(String s : arrayList) {
			str += s + " / ";
		}
		str = str.substring(0,str.length()-3);
		System.out.println("9. str : " + str);
		System.out.println();
		
		// 인반 for문
		for(int i=0 ; i<arrayList.size(); i++) {
			System.out.println(i+"번째 : " + arrayList.get(i));
		}
		System.out.println();
		
		// 모든 자료 삭제(clear())
		arrayList.clear();
		System.out.println("10. arrayList 크기 : " + arrayList.size());  
		System.out.println("10. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		List<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11. arrayList 크기 : " + arrayList3.size());  
		System.out.println("11. toString : " + arrayList3); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		// ArrayList객체의 내용을 모두 추가(합치기) : addAll()
		arrayList.addAll(arrayList3);
		System.out.println("12. arrayList 크기 : " + arrayList3.size());  
		System.out.println("12. toString : " + arrayList3); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		
		// ArrayList객체의 내용을 모두 추가(합치기) : addAll()
		arrayList.addAll(arrayList3);
		System.out.println("13. arrayList 크기 : " + arrayList.size());  
		System.out.println("13. toString : " + arrayList); // 많이 쓰는거라 기본으로 오버라이딩 되어있다..
		System.out.println();
		
		
	}
}
