import java.util.Scanner;
class coarse{
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
System.out.print ("what collage department would you like to enter?: ");
String uc=sc.nextLine();
if (uc.equals("coa")){
	System.out.print("what course in coa would you like to get?: ");
	String uccoa=sc.nextLine();
	if (uccoa.equals("accountancy")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccoa);
 }
	 if (uccoa.equals("accounting technology")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccoa);
}
	if (uccoa.equals("management accounting")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccoa);
}
	if (uccoa.equals("forensic accounting")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccoa);
}
}
else if (uc.equals("cba")){
	System.out.print("what course in cba would you like to get?: ");
	String uccba=sc.nextLine();
	if (uccba.equals("business administration")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccba);
 }
	 if (uccba.equals("entrepreneurship")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccba);
}
	if (uccba.equals("office administration")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccba);
}
}
else if (uc.equals("cea")){
	System.out.print("what course in cea would you like to get?: ");
	String uccea=sc.nextLine();
	if (uccea.equals("architecture")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccea);
 }
	 if (uccea.equals("civil engineering")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccea);
}
	if (uccea.equals("computer engineering")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccea);
}
 if (uccea.equals("electronics engineering")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccea);
}
	if (uccea.equals("environment and sanitary engineering")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccea);
}
}
else if (uc.equals("com")){
	System.out.print("what course in cicts would you like to get?: ");
	String uccom=sc.nextLine();
	if (uccom.equals("computer science")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccom);
 }
	 if (uccom.equals("information system")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccom);
}
	if (uccom.equals("information technology")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccom);
}
 if (uccom.equals("computer technology")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccom);
 }
}
else if (uc.equals("cas")){
	System.out.print("what course in cas would you like to get?: ");
	String uccas=sc.nextLine();
	if (uccas.equals("arts in english")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccas);
 }
	 if (uccas.equals("arts in political science")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccas);
}
	if (uccas.equals("arts in communication")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccas);
}
 if (uccas.equals("science psychology")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccas);
}
}
else if (uc.equals("cte")){
	System.out.print("what course in cte would you like to get?: ");
	String uccte=sc.nextLine();
	if (uccte.equals("general elementary education")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccte);
 }
	 if (uccte.equals("elementary education")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccte);
}
	if (uccte.equals("secondary education")){
	 System.out.print("\n your department is: "+uc+ "\n your course is: " +uccte);
}
}
}
}