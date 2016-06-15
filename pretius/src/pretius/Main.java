package pretius;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
		}
		File file = new File(sb.toString());
		BigDecimal wynik1 = new BigDecimal(0);
		BigDecimal wynik2 = new BigDecimal(0);
		BigDecimal liczba;
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] pom = sc.nextLine().split("@");

				if (pom.length < 4) {
				} else {

					String[] pom1 = pom[5].split(":");

					String[] pom2 = pom1[1].substring(0, pom1[1].length() - 3)
							.split(",");

					liczba = new BigDecimal(new String(pom2[0] + "." + pom2[1]));

					wynik2 = wynik1.add(liczba);
					wynik1 = wynik2;
					
				}

			}
			sc.close();
			System.out.println(wynik2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
