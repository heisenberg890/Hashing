/**
 * @author robin
 *
 */

public class Student {

    //name, GPA, major, and e-mail address.

    private String name;

    private double GPA;

    private String major;

    private String email;

//Default constructor

    /**
     * 
     */
    public Student() {

    }

//Parameterized constructor

    /**
     * @param name
     * @param gPA
     * @param major
     * @param email
     */
    public Student(String name, double gPA, String major, String email) {

        this.name = name;

        GPA = gPA;

        this.major = major;

        this.email = email;

    }

    /**
     * @return
     */
    public String getName() {

        return name;

    }

    /**
     * @param name
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     * @return
     */
    public double getGPA() {

        return GPA;

    }

    /**
     * @param gPA
     */
    public void setGPA(double gPA) {

        GPA = gPA;

    }

    /**
     * @return
     */
    public String getMajor() {

        return major;

    }

    /**
     * @param major
     */
    public void setMajor(String major) {

        this.major = major;

    }

    /**
     * @return
     */
    public String getEmail() {

        return email;

    }

    /**
     * @param email
     */
    public void setEmail(String email) {

        this.email = email;

    }


}
