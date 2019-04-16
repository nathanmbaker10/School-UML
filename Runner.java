public class Runner {
    public static void main(String[] args) {
        School berkeleyHigh = new School("Berkeley High");

        //Create Sections
        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section compSci = new Section("Computer Science");

        //Create Teachers
        Teacher albinson = new Teacher("Elective", "Albinson", 1);
        Teacher teacher2 = new Teacher("Mathematics", "Teacher2", 2);
        Teacher teacher3 = new Teacher("Science", "Teacher3", 3);

        //Create Students
        Student me = new Student(12, "Nathan Baker", 4);
        Student Friend1 = new Student(11, "Teo", 5);
        Student Friend2 = new Student(12, "Jacob Greenberg-Bell", 6);
        Student nico = new Student(12, "Nico Hausser", 7);
        Student andre = new Student(12, "Andre Assadi", 8);
        Student pia = new Student(12, "Pia Mahar-Morton", 9);

        //Add teachers to sections
        math.setTeacher(teacher2);
        biology.setTeacher(teacher3);
        compSci.setTeacher(albinson);

        //Add students to sections
        math.addStudent(me);
        math.addStudent(Friend1);
        math.addStudent(andre);

        biology.addStudent(nico);
        biology.addStudent(pia);
        biology.addStudent(Friend2);

        compSci.addStudent(Friend1);
        compSci.addStudent(Friend2);
        compSci.addStudent(andre);

        //To String Calls
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSci.toString());



    }
}
