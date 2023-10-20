package com.project.vaccination.model;

//import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "userdata")
public class UserDetail {
    @Id
    @GeneratedValue
    private int id;
   @Column(name = "username")
     private String idType;
      private String idNumber;
    private String name;
    private String email;
    private String phone;
    private String vaccineName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    @Override
    public String toString() {
        return "UserDetail [id=" + id + ", idType=" + idType + ", idNumber=" + idNumber + ", name=" + name + ", email="
                + email + ", phone=" + phone + ", vaccineName=" + vaccineName + "]";
    }
}
