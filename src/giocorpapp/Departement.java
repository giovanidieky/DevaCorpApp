/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giocorpapp;

/**
 *
 * @author User
 */
public class Departement extends LocationDept {
    private String nameDept;
    private String manager;

    public Departement(String nameDept, String manager, String street, String city, String state, String postalCode, String country) {
        super(street, city, state, postalCode, country);
        this.nameDept = nameDept;
        this.manager = manager;
    }
    
    public String getNameDept() {
        return nameDept;
    }

    public void setNameDept(String nameDept) {
        this.nameDept = nameDept;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    
}
