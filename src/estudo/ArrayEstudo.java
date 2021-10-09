package estudo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arralist = new ArrayList<String>();
		
		ArrayList<String> arralist01 = new ArrayList<String>();
		
		arralist.add("A");
		arralist.add("C");
		arralist.add("D");
		arralist.add("B");
		
		
		
		Collections.sort(arralist);
		
		arralist01= arralist;
		
		System.out.println(arralist);
		System.out.println(arralist01);
		
	
		//arralist.add(1, "B");
		
		//System.out.println(arralist);
		
		boolean existe = arralist.contains("X");
		
		if(existe) {
			System.out.println("existe o elemento");
		}else {
			System.out.println("não existe esse elemento");
		}
		
		int posicao = arralist.indexOf("c");
		
		if(posicao >= 0) {
			System.out.println("posicao existe " +posicao);
		}else {
			System.out.println("posicao não existe "+posicao);
		}
		
		arralist.remove(0);
		arralist.remove("C");
		
		System.out.println(arralist);
		
	}

}
