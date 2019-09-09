package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT="cal>";
	

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		calendar cal = new calendar();

	
		int month = 1;

		while (true) {	
		System.out.println("달을 입력하세요");
		System.out.println(PROMPT);
		month = scanner.nextInt();
		if(month==-1) {
break;
		}
		if(month >12) {
			continue;
		}
		cal.printCalendar(2019, month);
		}

		scanner.close();
			
			}
		
public static void main(String[] args) {
		// 셀 실행
Prompt p= new Prompt();
p.runPrompt();
		
	}

}
