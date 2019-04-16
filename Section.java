public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t) {

        this.teacher = t;
        t.addSection(this);
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student s) {
        this.students[this.currentSize] = s;
        this.currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String toReturn = "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: ";
        for(int i = 0; i < currentSize; i++) {
            toReturn += students[i].getName() + " ";
        }
        return toReturn;
    }

}
