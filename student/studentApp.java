package student;

import java.util.Scanner;

final public class studentApp {
    
    static Scanner scan = new Scanner(System.in);
    static Student_List stulist = new Student_List();
    static studentModel stModel=new studentModel();
    
   
        static{
          studentModel student1 = new studentModel(1, "vinni", "female", 201, "intermediate");
          studentModel student2 = new studentModel(2, "sai", "male", 202, "bTech");
          studentModel student3 = new studentModel(3, "ramya", "female", 203, "final Btech");
          stulist.addstudentToList(student1);
          stulist.addstudentToList(student2);
          stulist.addstudentToList(student3);
        }
     public static void main(String[] args) {
         try {
             while (true) {
                 System.out.println("******welcome to student app******\n");
                 System.out.println("1.create an student details\n2.Display all student details\n3.Delete an student details"+"\n4.search for student\n5.update a student\n6.Exit\n");
                 System.out.println("select an option");
                
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:studentModel stu = getinfoOfStudent();
                    System.out.print(stulist.addstudentToList(stu));
                        break;
                    case 2:stulist.displayAllStudent();
                        break;
                    case 3:int id = intIdForDeletestudent();
                    System.out.println(stulist.deletestudent(id));
                        break;
                    case 4:searchOption();
                        break;
                    case 5:updateStudent();
                        break;
                    case 6:System.out.println("***Exit for now***");System.exit(0);
                        break;
                
                    default:System.out.println("Invalid option please try again");
                        break;
                }

                 

                 
             }
         } catch (Exception e) {
             System.out.println("Error occured"+e);
         }

            
        }
    private static void updateStudent() {
        System.out.println("Enter the id whom do you want to update  :");int studentid=scan.nextInt();
        if(stulist.DisplayById(studentid));
        System.out.println("\nchoose which one do you want to update  :");
        System.out.println("\n1.stuName\n2.stuGender\n3.stuphnum\n4.stuClass");
        int option=scan.nextInt();
        switch (option){
            case 1:System.out.println("Enter the updated name  :");String name=scan.next();
                   System.out.println(stulist.updateString(1,name.toUpperCase()));
                
                break;
            case 2:System.out.println("enter the updated Gender");String gender=scan.next();
                   System.out.println(stulist.updateString(2, gender.toUpperCase()));
                   break;
            case 3:System.out.println("enter the updated phone num   :");String phnum=scan.next();
                   System.out.println(stulist.updateString(3,phnum.toUpperCase()));
                   
                   break;
            case 4:System.out.println("Enter the updated class   :");String stuclass=scan.next();
                   System.out.println(stulist.updateString(4, stuclass.toUpperCase()));
            default:System.out.println("    invalid option   ");
                break;
        }
    }
    private static void searchOption() {
        int a=1;
        System.out.println("search By  :");
        while (a==1) {
            System.out.println("1.Id\n2.name\n3.gender\n4.Exit\n\nselect an option");
            int option= scan.nextInt();
            switch (option) {

                case 1:System.out.println("Enter studentid    :");int studentId=scan.nextInt();
                       System.out.println(stulist.searchById(studentId));
                    
                    break;
                case 2:System.out.println("Enter name to search  :");String studentName=scan.next();
                    System.out.println(stulist.searchByName(studentName)); 
                    break;
                case 3:System.out.println("Enter Gender to search  :");String studentGender=scan.next();
                    System.out.println(stulist.searchByGender(studentGender));
                    break;
                case 4:
                a=0;
                break;         
            
                default:System.out.println("invalid option please try again");
                    break;
            }
            
        }
    }
    private static int intIdForDeletestudent() {
        System.out.println("Enter the id to delete  :");int stuid = scan.nextInt();
        return stuid;
    }
    private static studentModel getinfoOfStudent() {
        System.out.println("Enter student Id           :");Integer stuId = scan.nextInt();
        System.out.println("Enter student Name         :");String stuName=scan.next();
        System.out.println("Enter student Gender       :");String stuGender=scan.next();
        System.out.println("Enter student phone number :");int stuphnum=scan.nextInt();
        System.out.println("Enter student class        :");String stuClass=scan.next();
        System.out.println("------------------------");
        studentModel stu = new studentModel(stuId, stuName, stuGender, stuphnum, stuClass);
        return stu;
    }
    }

    

