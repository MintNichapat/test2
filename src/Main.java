public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(19,"women","mint");
        System.out.println(human1.getAge());
        human1.happyBirthDay();
        System.out.println(human1.getAge());
        human1.goOld();
        System.out.println(human1.getAge());


    }
}
