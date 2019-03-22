/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schooldatabase;

/**
 *
 * @author kulsoom-Abbas
 */
public class Person {
    
    private int id;
    private String name;
    private String email;
    
    

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id+"\t"  +name +"\t" + email+"\t"; //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
    
}
    

