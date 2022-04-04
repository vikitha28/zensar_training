package student;

public class studentModel {
    int studentId;
    String stuName;
    String stuGender;
    int stuphnum;
    String stuClass;
    public studentModel(int studentId, String stuName, String stuGender, int stuphnum, String stuClass) {
        this.studentId = studentId;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuphnum = stuphnum;
        this.stuClass = stuClass;
    }
    
    @Override
    public String toString() {
        return "studentModel [stuClass=" + stuClass + ", stuGender=" + stuGender + ", stuName=" + stuName
                + ", studentId=" + studentId + ", stuphnum=" + stuphnum + "]";
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuphnum() {
        return stuphnum;
    }

    public void setStuphnum(int stuphnum) {
        this.stuphnum = stuphnum;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

   
studentModel(){

}

public void setStuphnum(String updatedString) {
}
    
    
}
