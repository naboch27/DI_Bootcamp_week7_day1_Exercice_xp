/**
 * Computer
 */
public class Computer {

    protected String name;

    protected int memory;

    protected int scream;

    public Computer() {
    }

    public Computer(String name, int memory, int scream) {
        this.name = name;
        this.memory = memory;
        this.scream = scream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getScream() {
        return scream;
    }

    public void setScream(int scream) {
        this.scream = scream;
    }

    
    public void calcul(String device) {

        System.out.println(device+" a affiché les resultats du calcul ");
        
    }

    public void appel(String device) {

        System.out.println(device+" a affiché les resultats de l'appel ");
        
    }

    
    
}