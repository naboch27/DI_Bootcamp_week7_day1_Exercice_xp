public class SmartPhone extends Computer {

    private String itemSmartPhone;

    public SmartPhone(String name, int memory, int scream) {
        super(name, memory, scream);

    }

    public String getItemSmartPhone() {
        return itemSmartPhone;
    }

    public void setItemSmartPhone(String itemSmartPhone) {
        this.itemSmartPhone = itemSmartPhone;
    }

    public String displyLaptop() {
        return "Computer [name=" + name + ", memory=" + memory + ", scream=" + scream + "]" +
                "Laptop [itemSmartPhone=" + itemSmartPhone + "]";
    }

}
