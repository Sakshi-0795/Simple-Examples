public class Student{
    int studentId;
    String studentName;
    char studentGrade;

    public Student() {
        this.studentId = 0;
        this.studentName = "Unknown";
        this.studentGrade = 'F';
    }
    public Student(int studentId,String studentName, char grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
    public void display() {
        System.out.println(" ID:"+studentId   + "Name:"+studentName +  "Grade:"+studentGrade);
    }
    public static void main(String[]args){
         Student student1 = new Student();
         student1.display();
         System.out.println();

         Student student2 = new Student(101,"DODO",'A');
         student2.display();

         
    }
  
    
    }
