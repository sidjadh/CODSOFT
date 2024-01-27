import java.util.*;

//student class stores the student's information
class Student
{
    Scanner sc = new Scanner(System.in);
    
    int n, total=0;
    float percentage;
    String grade;

    //takes the input of no of subjects, marks of subjects
    void get_input()
    {
        System.out.println("Enter total number of subjects");
        n=sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks of all subjects");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
    }

    //to calculate the percentage
    void calculate()
    {
        percentage = (float)total / (float)n;
    }
    
    //displays the student marks, percentage and grade
    void display()
    {
        System.out.println();
        System.out.println("********** STUDENT'S RESULT **********");
        System.out.println();
        System.out.println("          TOTAL MARKS : " + total);
        System.out.printf("          PERCENTAGE  : %.2f", percentage);
        System.out.println();

        if(percentage >= 90)
        grade = "A+";
        else if(percentage >= 80)
        grade = "A";
        else if(percentage >= 70)
        grade = "B+";
        else if(percentage >= 60)
        grade = "B";
        else if(percentage >= 55)
        grade = "C+";
        else if(percentage >= 50)
        grade = "C";
        else if(percentage >= 45)
        grade = "D+";
        else if(percentage >= 40)
        grade = "D";
        else 
        grade = "F";

        System.out.println("          Grade      : " + grade);

    }
    
}

public class grade_calculator
{
    public static void main(String args[])
    {
        //create an object of student

        Student S = new Student();
        S.get_input();
        S.calculate();
        S.display();

    }
}