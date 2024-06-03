public class Main {
    public static void main(String[] args) {
        Mother grandmother= new Mother(69,"Anna", Gender.FEMALE, 3);
        Mother mother = new Mother(44, "Lena", Gender.FEMALE, 2);
        Daughter daughter = new Daughter(12, "Leni", Gender.FEMALE, 0, "Singing");

        System.out.println(grandmother.getInfo());
        System.out.println(mother.getInfo());
        System.out.println(daughter.getInfo());

        grandmother.careForChild();
        grandmother.careForChild(5);
        grandmother.careForChild("Playing");

        mother.careForChild();
        mother.careForChild(3);
        mother.careForChild("Reading");

        daughter.careForChild();
        daughter.careForChild(1);
        daughter.careForChild("Drawing");
    }
}
