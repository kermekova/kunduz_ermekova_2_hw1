public final class Daughter extends Mother {
    private String hobby;

    public Daughter(int age, String name, Gender gender, int numberOfChildren, String hobby) {
        super(age, name, gender, numberOfChildren);
        this.hobby = hobby;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Hobby: " + hobby;
    }

    @Override
    public void careForChild() {
        System.out.println("Caring for a sibling");
    }
}
