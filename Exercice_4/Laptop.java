public class Laptop extends Computer{

    private String itemLaptop;

    public Laptop(String name, int memory, int scream) {
        super(name,memory,scream);
       
    }

    public String getItemLaptop() {
        return itemLaptop;
    }

    public void setItemLaptop(String itemLaptop) {
        this.itemLaptop = itemLaptop;
    }

    public String displyLaptop() {
        return "Computer [name=" + name + ", memory=" + memory + ", scream=" + scream + "]"+
        "Laptop [itemLaptop=" + itemLaptop + "]";
    }



}
