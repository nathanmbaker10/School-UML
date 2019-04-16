public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int newID) {
        this.id = newID;
    }
}
