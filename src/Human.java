public class Human {
    private int age;
    private String sex;
    private String name;

    public Human(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
    public int happyBirthDay(){
        return  age+=1;
    }

    public  int goOld(){
        age = 60;
        return age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
