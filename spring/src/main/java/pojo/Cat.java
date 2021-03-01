package pojo;

/**
 * @author Florence
 */
public class Cat {
    private String name;
    private String habit;
    private String target;
    private String master;

    public Cat(String name, String habit) {
        this.name = name;
        this.habit = habit;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", habit='" + habit + '\'' +
                ", target='" + target + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}
