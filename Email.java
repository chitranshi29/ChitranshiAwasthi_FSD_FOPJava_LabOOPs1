package greatlearning;

import java.util.*;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private String companySuffix = "kpmg.com";

    /*
    private is used so that we can use encapsulation property of OOPS.
    to access firstName & lastName we use getters & setters or constructors.
    */

    //Constructor for firstName and lastName to access them
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
      System.out.println("Email Created : " + firstName + " " + lastName);

        //call a method which asks for a department and returns department
        this.department = setDepartment();
      //  System.out.println("Department : " + this.department);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department + "." + companySuffix;
//        System.out.println("Email Id : " + email);
        
        System.out.println( "Dear" +"  " + firstName + "  "+  "you  have generated credential as follows" + "\nCompany Email : " + email +  " ");
        
        //call a method which generates random password
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your Password is " + this.password);
    }

    //Ask for Department
    private String setDepartment(){
        System.out.print("\nDepartment Codes\n 1 for Technical\n 2 for Admin \n 3 for Human Resource \n 4 for legal\n  Enter the Department : ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){ return "Technical";}
        else if (deptChoice == 2){ return "Admin"; }
        else if (deptChoice == 3){ return "Human Resource";}
        else if (deptChoice == 4){ return "Legal";}
        else{ return "No Such Department";}
    }

    //Generate a Random Password
    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&";
        char [] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //Change the Password
    public void changePassword(String password){
        this.password = password;
    }
    //Get the Password
    public String getPassword(){
        return password;
    }

    //Show all the information
  //  public String showInfo(){
   //     return "Dear" +"  " + firstName + "  "+  "you  have generated credential as follows" + "\nCompany Email : " + email +  " ";
   // }

   
}
