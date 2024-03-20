package t4_Set;

import java.util.TreeSet;

/*
   TreeSet : Set계열자료구조, 집합자료구조, HashSet과의 차이점을 순서가 없이 들어가 있는 자료를 꺼낼때는 오름차순 정렬되어 꺼내준다.
 */
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
//		for(int i=0 ; i<10 ; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
//		treeSet.add(5);//중복은 덮어쓰기됨...
//		treeSet.add(5);
		
		for(int i=50; i>0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println("1. 크기 : " + treeSet.size());
		System.out.println("1. treeSet : " + treeSet);
		System.out.println();
		
		System.out.println("2.first() : " + treeSet.first());
		System.out.println("2.last() : " + treeSet.last());
		System.out.println("2.lower() - 검색자료보다 작은것들중 가장큰값 : " + treeSet.lower(26));
		System.out.println("2.Higher() - 검색자료보다 큰것들중 가장 작은값 : " + treeSet.higher(26));
		System.out.println("2.floor() - 같거나 작은것 : " + treeSet.floor(25));
		System.out.println("2.ceiling() - 같거나 큰것 : " + treeSet.ceiling(25));
		System.out.println();
		// pollFirst() : 원소들 중에서 작은 원소 값을 꺼내어준다.
		System.out.println(treeSet);
		System.out.println(treeSet.size());
		System.out.print("8. pollFirst : ");
		for(int i=0 ; i<25 ; i++) {
			System.out.print(treeSet.pollFirst()+" ");
		}
		System.out.println();

		for(int i=50; i>0 ; i-=2) {
			treeSet.add(i);
		}
		
		// pollLast() : 원소들 중에서 큰 원소 값을 꺼내어준다.
		System.out.print("8. pollLast : ");
		for(int i=0 ; i<25 ; i++) {
			System.out.print(treeSet.pollLast()+" ");
		}
		System.out.println();
	}
}
