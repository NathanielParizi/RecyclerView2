package Model;

/**
 * Created by go on 10/23/2017.
 */

public class ListItem {


    private String name;
    private String description;

    public ListItem(String name, String descrpition){

    this.name = name;
        this.description = descrpition;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
