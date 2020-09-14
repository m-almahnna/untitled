package example;

//import javax.ws.rs.Path;

//@Path("mod/m")

public class mohammed {
    private String Name;
    public mohammed(String Name){
        System.out.println(Name);

}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "mohammed{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
