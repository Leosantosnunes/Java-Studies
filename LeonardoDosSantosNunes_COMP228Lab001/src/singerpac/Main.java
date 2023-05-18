package singerpac;

import java.time.LocalDate;

public class Main
{

	public static void main(String[] args)
	{		
		//Instance the first singer
		Singer singer1 = new Singer();
		//display first singer
		System.out.println(singer1);
		//set the values of the instance
		//display the value		
		singer1.setName("John Doe");
		System.out.println(singer1);
		
		singer1.setAdress("133 Lawrence Ave");
		System.out.println(singer1);
		
		singer1.setSingerId(0001);
		System.out.println(singer1);
		
		singer1.setBirth(LocalDate.of(1975,05,01));
		System.out.println(singer1);
		
		singer1.setNumberOfAlbuns(12);
		System.out.println(singer1);
		
		//Instance the second singer
		Singer singer2 = new Singer(0002,"Mary Carey","1564 Eglinton Ave",LocalDate.of(1988,07,01),22);
		//display second singer
		System.out.println(singer2.toString());
	}

}
