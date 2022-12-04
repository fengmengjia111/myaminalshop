public class Hamster extends Animal {
    private double price;

    public Hamster() {
        this.price = 10;
    }
    public Hamster(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = 10;
    }
    @Override
    public String toString() {
        return "仓鼠的姓名为:" + this.name + " 年龄为：" + this.age + " 性别为：" + this.sex + " 价格为：" + this.price;
    }
}