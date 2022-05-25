
package studentdetails;


public class Main {
    
    //Printing 3 student details, use array of objects

    public static void main(String[] args) {
 
      Student[]studentList = new Student[3];//array of objects
          Student a = new Student();
          Student b = new Student();
          Student c = new Student();
          a.setName("Emily");
          a.setAge(20);
          b.setName("Alison");
          b.setAge(20);
          c.setName("Ian");
          c.setAge(20);
          //Stored objects in array
          studentList[0]=a;
          studentList[1]=b;
          studentList[2]=c;
          for(int i= 0;i<=studentList.length; i++)
              System.out.println(studentList[i].getName() +" " +studentList[i].getAge());
          
}
    
}
