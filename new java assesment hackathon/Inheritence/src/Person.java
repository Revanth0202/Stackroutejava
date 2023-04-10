public class Person {
    private String name;
    private String dateofbirth;
    private String gender;
    private String mobilenumber;
    private String bloodgroup;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
}
