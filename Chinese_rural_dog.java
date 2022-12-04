public class Chinese_rural_dog extends Animal {
    //是否注射狂犬病疫苗
    private boolean isVaccineInjected;
    private double price;
    public Chinese_rural_dog() { this.price=100;
    }
    public Chinese_rural_dog(String name, int age, String sex, double price,boolean isVaccineInjected) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = 100;
        this.isVaccineInjected = isVaccineInjected;
    }

    public boolean isIsVaccineInjected() {
        return isVaccineInjected;
    }

    public void setIsVaccineInjected(boolean isVaccineInjected) {
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return "中华田园犬的姓名为:" + this.name  + " 年龄为：" + this.age  + " 性别为：" + this.sex + " 价格为：" + this.price + " 是否注射狂犬疫苗：" + this.isVaccineInjected;
    }
}





