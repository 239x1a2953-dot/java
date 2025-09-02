package day2;

public class Student {
     String stdName;
     int RegNum;
     String Branch;
     double percentage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student S1=new Student();
     S1.stdName="Scott";
     S1.RegNum=101;
     S1.Branch="CSE";
     S1.percentage=89.9;
     System.out.println("Student Name :"+S1.stdName);
    System.out.println("Register Number :"+S1.RegNum);
    System.out.println("Branch :"+S1.Branch);
    System.out.println("Percentage :"+S1.percentage);
    System.out.println("----------------------------");
    Student S2=new Student();
    S2.stdName="Soda";
    S2.RegNum=2961;
    S2.Branch="CSB";
    S2.percentage=90.0;
    System.out.println("Student Name :"+S2.stdName);
   System.out.println("Register Number :"+S2.RegNum);
   System.out.println("Branch :"+S2.Branch);
   System.out.println("Percentage :"+S2.percentage);
   System.out.println("----------------------------");
   Student S3=new Student();
   S3.stdName="Srinath";
   S3.RegNum=2934;
   S3.Branch="CSB";
   S3.percentage=95.5;
   System.out.println("Student Name :"+S3.stdName);
  System.out.println("Register Number :"+S3.RegNum);
  System.out.println("Branch :"+S3.Branch);
  System.out.println("Percentage :"+S3.percentage);
  System.out.println("----------------------------");
  Student S4=new Student();
  S4.stdName="Pavan";
  S4.RegNum=2963;
  S4.Branch="CSE";
  S4.percentage=93.5;
  System.out.println("Student Name :"+S4.stdName);
 System.out.println("Register Number :"+S4.RegNum);
 System.out.println("Branch :"+S4.Branch);
 System.out.println("Percentage :"+S4.percentage);
 System.out.println("----------------------------");
	}

}
