public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;


    public Teacher(String subject, String name, int id) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n) {
        this.subject = n;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section n) {
        this.sections[this.sectionCount] = n;
        sectionCount++;
    }
}
