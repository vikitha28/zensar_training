package student;

import java.util.ArrayList;
import java.util.List;

public class Student_List {
    static List<studentModel> ls=new ArrayList<>();
    private int id;


    

    public void add(studentModel student1) {
    }

    public boolean addstudentToList(studentModel student1) {
        ls.add(student1);
        return true;
    }

    public void displayAllStudent() {
        System.out.println("vikitha");
        for (studentModel e : ls) {
            System.out.println(e.toString());
            
        }
    }

    public String deletestudent(int id) {
        //System.out.println("vikitha tummalapalli");
        for (studentModel s : ls) {
           // System.out.println("hai");
            if (s.getStudentId()==id) {
                ls.remove(s);
                return "Deleted Successfully";
                
            }
            
        }
        return "no match found";
        
    }

    public String searchById(int studentId) {
    for (studentModel s : ls) {
       // System.out.println("hai");
        if (s.getStudentId()==studentId) {
           return s.toString();
        }

    }
       return "no record found with this id";
    }

    public String searchByName(String studentName) {
        for (studentModel s : ls) {
            if (s.equals(studentName)) {
                return s.toString();
                
            }
            
        }return "no record found";
            
        }
       
    

    public String searchByGender(String studentGender) { for (studentModel s : ls) {
        if (s.getStuGender() == studentGender){
            return s.toString();
            
        }
        
    }return "no record found";
       
    }

    public boolean DisplayById(int studentid) {
        return false;
    }

    public String updateString(int option,String updatedString) {System.out.println("vikitha........");
        for (studentModel sm : ls) 
        {
            if  (sm.getStudentId()==id) 
            {
                if (option==1){sm.setStuName(updatedString);return "updated succesfully";}
                else if(option==2){sm.setStuClass(updatedString);return "updated succesfully";}
                else if(option==3){ sm.setStuGender(updatedString);return "updated succesfully";}
                else if(option==4){sm.setStuphnum(updatedString);return "updated succesfully";}
                    
            } else {
                    return "updation failed";
                   }
                
            
            
        }
        return updatedString;
    }

   

}
