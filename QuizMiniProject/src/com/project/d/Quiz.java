package com.project.d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

Scanner sc=new Scanner(System.in);
	
	public void logic() {
	
	System.out.println("********--------Quiz Compitition-------********");
	System.out.println(" ");
	for(int i=0; i<=2; i++) {
		int correctAnsCount=0;
		int wrongAnsCount=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student Name:");
	String name=sc.next();
	System.out.println("Enter Student Id:");
	int id=sc.nextInt();
	System.out.println(" ");
	
Questions q1=new Questions("question"+":"+" Who invented Java Programming?","option1"+":"+"A. Guido van Rossum","option2"+":"+"B. James Gosling","option3"+":"+"C. Dennis Ritchie","option4"+":"+"D.Bjarne Stroustrup");

Questions q2=new Questions("question"+":"+" Which component is used to compile, debug and execute the java programs?"
		+ "","option1"+":"+"A. JRE","option2"+":"+"B. JIT","option3"+":"+"C. JDK","option4"+":"+"D. JVM");

Questions q3=new Questions("question"+":"+" Which of the following is not an OOPS concept in Java?"
		+ ""
		+ "","option1"+":"+"A. Polymorphism","option2"+":"+"B. Inheritance","option3"+":"+"C. Compilation","option4"+":"+"D. Encapsulation");

Questions q4=new Questions("question"+":"+" Which of these keywords is used to define interfaces in Java?"
		+ ""
		+ "","option1"+":"+"A. intf","option2"+":"+"B. Intf","option3"+":"+"C. interface","option4"+":"+"D. Interface");

Questions q5=new Questions("question"+":"+" Which of these packages contains the exception Stack Overflow in Java?"
		+ ""
		+ ""
		+ "","option1"+":"+"A. java.io","option2"+":"+"B. java.system"
				+ "","option3"+":"+"C. java.lang"
						+ "","option4"+":"+"D. java.util");

Questions q6=new Questions("question"+":"+" Which of the following is not an access modifier?"
		+ "","option1"+":"+"A. Protected","option2"+":"+"B. Void","option3"+":"+"C. Public","option4"+":"+"D. Private");

Questions q7=new Questions("question"+":"+" Which of these cannot be used for a variable name in Java?"
		+ "","option1"+":"+"A. identifier & keyword","option2"+":"+"B. identifier","option3"+":"+"C. keyword","option4"+":"+"D. non of the mentioned");

Questions q8=new Questions("question"+":"+" What is the Extension of compiled java classes?"
		+ "","option1"+":"+"A. .txt","option2"+":"+"B. .js","option3"+":"+"C. .class","option4"+":"+"D. .java");

Questions q9=new Questions("question"+":"+" Which of these standard collection classes implements a dynamic array?"
		+ "","option1"+":"+"A. AbstractList","option2"+":"+"B. LinkedList","option3"+":"+"C. ArrayList","option4"+":"+"D. Abstract Set");

Questions q10=new Questions("question"+":"+" Automatic type conversion is possible in which of the possible?"
		+ "","option1"+":"+"A. Byte to int","option2"+":"+"B. Int to long","option3"+":"+"C. Long to int","option4"+":"+"D. Short to int");
	
	
Map<Questions, Character>  hmap= new HashMap<Questions, Character>();
hmap.put(q1, 'B');
hmap.put(q2, 'C');
hmap.put(q3, 'C');
hmap.put(q4, 'C');
hmap.put(q5, 'C');
hmap.put(q6, 'B');
hmap.put(q7, 'A');
hmap.put(q8, 'D');
hmap.put(q9, 'C');
hmap.put(q10,'B');
	
for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
	System.out.println(map.getKey().getQuestion());
	System.out.println(map.getKey().getOption1());
	System.out.println(map.getKey().getOption2());
	System.out.println(map.getKey().getOption3());
	System.out.println(map.getKey().getOption4());

	System.out.println("Enter the Answer:");
	Character ans=sc.next().charAt(0);
	
	int cans=Character.compare(ans,map.getValue());
	

	if(cans==0) {
		System.out.println("Correct");
		correctAnsCount++;
		System.out.println(" ");
	}
	else {
		System.out.println("Wrong");
		wrongAnsCount++;
		System.out.println(" ");

	}

}
	
System.out.println();
System.out.println("****-----------Result----------****");
System.out.println("Student Name:"+name);
System.out.println("Student Id:"+id);
System.out.println("Total Questions:"+hmap.size());
System.out.println("Correct Answered :"+ correctAnsCount);
System.out.println("Wrong Answered :"+ wrongAnsCount);
int score=(10*correctAnsCount)/hmap.size();
System.out.println("Score:"+ (10*correctAnsCount)/hmap.size());

if(score>8) {
	System.out.println("---Performance:Scoring in class A---");
}
else if(score==6 && score==8) {
	System.out.println("Performance:Scoring in class B");
}
else if(score==5) {
	System.out.println("Performance:Scoring in class C");
}
else {
	System.out.println("--Student is failed--");
}
}
	}

}


	
	