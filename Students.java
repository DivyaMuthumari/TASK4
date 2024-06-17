package com.task4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Students{
        int roll_no;
        int age;
        String Name;
        String course;
        public Students(int a, int b,String c,String d){
            this.roll_no=a;
            this.age=b;
            this.Name=c;
            this.course=d;

        }
        public static void main(String[] args) throws Exception {
            //System.out.println("enter roll_no,name,age,course of the students");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter roll_no,name,age,course of the students");
            int roll_no = Integer.parseInt(bufferedReader.readLine());
            String Name = bufferedReader.readLine();
            int age = Integer.parseInt(bufferedReader.readLine());
            String course = bufferedReader.readLine();
            System.out.println(roll_no + Name + age + course);

            try {
                if (age <15 || age>21) {
                    throw new AgeNotWithinRangeException("Age not within range");

                } else {
                    System.out.println("valid age");
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            try {
                if (Name.matches(".*[^a-zA-Z].*")){
                    throw new NameNotValidException("Name not valid");
                } else {
                    System.out.println("valid name");
                }
            } catch(Exception exception){
                    System.out.println(exception.getMessage());
                }

            }
                }

