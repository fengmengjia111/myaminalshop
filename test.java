import java.util.LinkedList;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyAnimalShop myAnimalShop = new MyAnimalShop();
        System.out.println("今天的日期是：");
        LocalDate localDate=new LocalDate();
        localDate.setYear(sc.nextInt());
        localDate.setMonth(sc.nextInt());
        localDate.setDay(sc.nextInt());
        System.out.println("宠物店的余额为：");
        double money =sc.nextDouble();
        myAnimalShop.setSurplusMoney(money);
        Chinese_rural_dog dog1=new Chinese_rural_dog("玉玉",2,"男",100,true);
        Chinese_rural_dog dog2=new Chinese_rural_dog("花花",1,"女",100,true);
        Cat cat1 =new Cat("小咪",2,"女",200);
        Cat cat2 =new Cat("大咪",2,"男",200);
        Hamster hamster1=new Hamster("汤圆",1,"男",10);
        Hamster hamster2=new Hamster("汤包",1,"男",10);
        myAnimalShop.getAnimals().add(dog1);
        myAnimalShop.getAnimals().add(dog2);
        myAnimalShop.getAnimals().add(cat1);
        myAnimalShop.getAnimals().add(cat2);
        myAnimalShop.getAnimals().add(hamster1);
        myAnimalShop.getAnimals().add(hamster2);
        System.out.println("宠物店有以下的宠物:");
        for(int j=0;j<myAnimalShop.getAnimals().size();j++){
            System.out.println(myAnimalShop.getAnimals().get(j).toString());
        }
        myAnimalShop.buyAnimals();

        while(true){
            Customer customer=new Customer();
            customer.setDate(localDate);
            myAnimalShop.treatCustomer(customer);
            if(myAnimalShop.getAnimals().size()==3){
                break;
            }
        }
        myAnimalShop.closeShop();
        System.out.println("进入第二天");
        localDate.setDay(localDate.getDay()+1);
        for(int i=0;i<myAnimalShop.getAnimals().size();i++){
            System.out.println(myAnimalShop.getAnimals().get(i).toString());
        }
        myAnimalShop.buyAnimals();

        while(true){
            Customer customer=new Customer();
            customer.setDate(localDate);
            myAnimalShop.treatCustomer(customer);
            if(myAnimalShop.getAnimals().size()==0){
                break;
            }
        }
        myAnimalShop.closeShop();

    }
}
