package honux.calendar;

import java.util.Scanner;

public class calendar {
	
	private final int[] MAX_DAYS = {31, 28, 31,30,31,30,31,31,30,31,30,31};
	private final int[] LEAP_MAX_DAYS = {31, 28, 31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapyear(int year) {
		if(year % 4 ==0 && (year % 100!= 0 ||year %400== 0 ))
	return true;
		else
		return false;
	}
	public int getmaxDaysOFMonth(int year,int month) {
		if(isLeapyear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}else {
		return MAX_DAYS[month-1];
		}
	}
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("  <<%4d  %3d>>\n", year, month);
System.out.println("일   월   화   수   목   금   토");
System.out.println("---------------------");

//print blank space
for (int i=0; i< weekday; i++) {
	System.out.print("   ");
}
int maxDay = getmaxDaysOFMonth(year, month);


//print from second line to last

for(int i=1; i<= maxDay; i++) {
  System.out.printf("%3d",i);
  if(i %7==0)
	  System.out.println();
}
//System.out.println();
//System.out.println(" 1  2  3  4  5  6  7 ");
//System.out.println(" 8  9 10 11 12 13 14");
//System.out.println("15 16 17 18 19 20 21");
//System.out.println("22 23 24 25 26 27 28");


//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

String PROMPT="cal>";
Scanner scanner = new Scanner(System.in);
calendar cal = new calendar();

System.out.println();
System.out.println("입력횟수를 입력하세요");
int repeat = scanner.nextInt();

for(int i=0; i< repeat; i++) {

System.out.println("달을 입력하세요");
System.out.println(PROMPT);
month = scanner.nextInt();


System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getmaxDaysOFMonth(year, month));
}

scanner.close();
	
	}
}
