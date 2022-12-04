public class Cat extends Animal {
    private double price;
    public Cat() {
        this.price = 200;
    }

    public Cat(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = 200;
    }
    @Override
    public String toString() {
        return "猫猫的姓名为:" + this.name + " 年龄为：" + this.age + " 性别为：" + this.sex + " 价格为：" + this.price;
    }
}
