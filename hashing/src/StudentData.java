public class StudentData {
        /**
         * @param args
         */
        public static void main(String[] args) {

//Set student data

            //create an object for the student class
            @SuppressWarnings({ "unchecked", "rawtypes" })
			Hasher<String, Student> studentData = new Hasher();
            
            
            //create some students
            studentData.put("00158268", new Student("Jerry Seinfeld", 4.0, "Dramatic Arts, Comedy", "J.seinfeld@gmail.com"));
            studentData.put("00158269", new Student("Elaine Benes", 3.0, "Clothing Marketing", "E.benes@gmail.com"));
            studentData.put("00158270", new Student("George Costanza", 1.2, "Architecture", "G.costanza@@gmail.com"));
            studentData.put("00158271", new Student("Cosmo Kramer", 2.0, "Entrepreneurship", "C.Kramer@@gmail.com"));
            
            /*
            *This area retrieves and outputs the student information using the student ID number as the unique
            *Identifier Key
            *
             */

            //retrieves student by the Student ID
            Student studentInfo = (Student)studentData.get("00158268");
            System.out.println("Student by ID: 00158268");
            System.out.println("Name: "+studentInfo.getName());
            System.out.println("GPA:"+studentInfo.getGPA());
            System.out.println("Major: "+studentInfo.getMajor());
            System.out.println("E-mail"+studentInfo.getEmail());
            System.out.println("\n\n");



            Student studentInfo1 = (Student)studentData.get("00158269");
            System.out.println("Student by ID: 00158269");
            System.out.println("Name: "+studentInfo1.getName());
            System.out.println("GPA:"+studentInfo1.getGPA());
            System.out.println("Major: "+studentInfo1.getMajor());
            System.out.println("E-mail"+studentInfo1.getEmail());
            System.out.println("\n\n");


            Student studentInfo2 = (Student)studentData.get("00158270");
            System.out.println("Student by ID: 00158270");
            System.out.println("Name: "+studentInfo2.getName());
            System.out.println("GPA:"+studentInfo2.getGPA());
            System.out.println("Major: "+studentInfo2.getMajor());
            System.out.println("E-mail"+studentInfo2.getEmail());
            System.out.println("\n\n");


            Student studentInfo3 = (Student)studentData.get("00158271");
            System.out.println("Student by ID: 00158271");
            System.out.println("Name: "+studentInfo3.getName());
            System.out.println("GPA:"+studentInfo3.getGPA());
            System.out.println("Major: "+studentInfo3.getMajor());
            System.out.println("E-mail"+studentInfo3.getEmail());
            System.out.println("\n\n");
            
            

        }//end main method

}//end class StudentData
