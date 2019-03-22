/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schooldatabase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kulsoom-Abbas
 */
public class Test {
    
    public void createPerson(){
    
    List <Person> personList = new ArrayList();
    List <Teacher> teacherList = new ArrayList();
    
    Person p1 = new Person (100, "Hans Nielsen","hni@easv.dk");
    personList.add(p1);
    
    Person p2 = new Person(200 , "Niels Hansen","nha@easv.dk");
    personList.add(p2);
    
    Person p3 = new Person(300,"Ib Boesen","ibo@easv.dk");
    personList.add(p3);
    
    Student s1 = new Student (700 , "Peter", "peter@easv.dk","Computer Science");
    personList.add (s1);
    s1.addGrade ("DBOS", 6);
    
    Teacher t1 = new Teacher(400,"Megan","megan@easv.dk","me",234.5);
    teacherList.add(t1);
    
    Teacher t2 = new Teacher (500,"Jeppe","jeppe@easv.dk","je",545.3);
    teacherList.add(t2);
    
    t2.addSubject("Programming");
    t1.addSubject("Maths");
    
        for (Person pp : personList) {
            System.out.println(pp.toString());
            
        for (Teacher tt : teacherList ) {
             System.out.println(tt.toString());  
                
            }
            
        }
    
    }
    
   
    
}
    
