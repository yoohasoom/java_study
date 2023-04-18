package hello_java;

public class two {
		public two(int io) {
			if(io <= 9 && io >= 1) {
				System.out.println(io + "단");
				for(int i = 1; i <= 9; i++) {
					System.out.println(io * i);
				}
				}
		}
	}


package hello_java;

import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ii = sc.nextInt();
		two doo = new two(ii);
	}
}
