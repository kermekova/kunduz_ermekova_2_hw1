public class Mother extends Person{
    private int numberOfChildren;

    public Mother(int age,String name, Gender gender, int numberOfChildren) {
        super(age, name, gender);
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Number of Children: " + numberOfChildren;
    }

    public void careForChild(){
        System.out.println("Caring for a child ");
    }
    public void careForChild(int hours) {
        System.out.println( getName() + " caring for a child for " + hours + " hours.");
    }

    public final void careForChild(String activity) {
        System.out.println(getName() + " caring for a child with activity: " + activity);
    }
}
