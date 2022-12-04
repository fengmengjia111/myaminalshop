import java.util.LinkedList;
import java.util.Scanner;
public class MyAnimalShop implements AnimalShop {

    private double surplusMoney;
    private LinkedList<Animal> animals;
    private LinkedList<Customer> customers;
    private LinkedList<Customer> customersList;
    private boolean doBusiness;
    //当天的利润
    private double dayDrofit;

    public double getSurplusMoney() {
        return surplusMoney;
    }

    public void setSurplusMoney(double surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    public LinkedList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(LinkedList<Animal> animals) {
        this.animals = animals;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(LinkedList<Customer> customers) {
        this.customers = customers;
    }


    public LinkedList<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(LinkedList<Customer> customersList) {
        this.customersList = customersList;
    }


    public boolean isDoBusiness() {
        return doBusiness;
    }


    public void setDoBusiness(boolean doBusiness) {
        this.doBusiness = doBusiness;
    }

    public double getDayDrofit() {
        return dayDrofit;
    }


    public void setDayDrofit(double dayDrofit) {
        this.dayDrofit = dayDrofit;
    }

    public MyAnimalShop() {
        animals=new LinkedList<>();
        customers=new LinkedList<>();
        customersList=new LinkedList<>();
    }

    public MyAnimalShop(double surplusMoney, LinkedList<Animal> animals, LinkedList<Customer> customers, LinkedList<Customer> customersList, boolean doBusiness, double dayDrofit) {
        this.surplusMoney = surplusMoney;
        this.animals = animals;
        this.customers = customers;
        this.customersList = customersList;
        this.doBusiness = doBusiness;
        this.dayDrofit = dayDrofit;
    }
    Scanner sc=new Scanner(System.in);
    @Override
    public void buyAnimals() {
    System.out.println("请选择购买的动物种类：1.中华田园犬 2.猫猫 3.仓鼠");
    int choose=sc.nextInt();
    switch(choose){
        case 1:
            try {
                if(surplusMoney>100)
                {
                     Chinese_rural_dog dog = new Chinese_rural_dog();
                     System.out.println("请输入这只中华田园犬的姓名：");
                     String name=sc.next();
                     dog.setName(name);
                     System.out.println("请输入这只中华田园犬的年龄：");
                     int age=sc.nextInt();
                     dog.setAge(age);
                     System.out.println("请输入这只中华田园犬的性别：");
                     String sex=sc.next();
                     dog.setSex(sex);
                     System.out.println("这只中华田园犬的买入价格：100");
                     System.out.println("这只中华田园犬是否注射疫苗：");
                     System.out.println("1.是 2.否");
                     int isVaccineInjected=sc.nextInt();
                     if(isVaccineInjected==1)
                     {
                         dog.setIsVaccineInjected(true);
                     }
                     else if(isVaccineInjected==2){
                         dog.setIsVaccineInjected(false);
                     }
                     else{
                         System.out.println("不知道这只中华田园犬是否打了狂犬疫苗");
                     }
                    animals.add(dog);                }
                else {
                    throw new InsufficientBalanceException();
                }
            } catch (InsufficientBalanceException e) {
            }
            break;
        case 2:
            try {

                if(surplusMoney>200){
                    Cat cat = new Cat();
                    System.out.println("请输入这只猫猫的姓名：");
                    String name=sc.next();
                    cat.setName(name);
                    System.out.println("请输入这只猫猫的年龄：");
                    int age=sc.nextInt();
                    cat.setAge(age);
                    System.out.println("请输入这只猫猫的性别：");
                    String sex=sc.next();
                    cat.setSex(sex);
                    System.out.println("这只猫猫的买入价格：200");
                    animals.add(cat);
                }
                else {
                    throw new InsufficientBalanceException();
                }
            } catch (InsufficientBalanceException e) {
            }
            break;

                    case 3:
            try {

                if(surplusMoney>10){
                    Hamster hamster = new Hamster();
                    System.out.println("请输入这只猫猫的姓名：");
                    String name=sc.next();
                    hamster.setName(name);
                    System.out.println("请输入这只猫猫的年龄：");
                    int age=sc.nextInt();
                    hamster.setAge(age);
                    System.out.println("请输入这只猫猫的性别：");
                    String sex=sc.next();
                    hamster.setSex(sex);
                    System.out.println("这只猫猫的买入价格：200");
                    animals.add(hamster);
                }
                else {
                    throw new InsufficientBalanceException();
                }
            } catch (InsufficientBalanceException e) {
            }
            break;
        default:
            System.out.println("没有此类动物供你购买");
    }
    }

    @Override
    public void treatCustomer(Customer customer) {
        int i;
        int flag=0;
        System.out.println("这位客户的信息为：");
        System.out.println("姓名为：");
        String name =sc.next();
        customer.setName(name);
        for(i=0;i< customers.size();i++){
            if(customer.getName().equals(customers.get(i).getName()))
            {
               customers.get(i).setCount(customers.get(i).getCount()+1);
               customer.setCount(customers.get(i).getCount());
               customers.get(i).setDate(customer.getDate());
               int j=0;
               for(;j< customersList.size();j++){
                   if (customersList.get(j).getName().equals(customer.getName())) {
                       customersList.get(j).setCount(customer.getCount());
                       customersList.get(j).setDate(customer.getDate());
                       break;
                   }
               }
               if(j==customersList.size()){
                   customersList.add(customer);
               }
               flag=1;
               break;
            }
        }
        if(flag==0){
            customer.setCount(1);
            customers.add(customer);
            customersList.add(customer);
        }
        System.out.println("到店次数为:"+customer.getCount());
        System.out.println("最新到店时间为:"+customer.getDate().toString());
        try {
            if(animals.size()!=0){
             int choose=0;
              for(i=0;i< animals.size();i++){
                System.out.println(animals.get(i).toString());
                System.out.println("请问您要买这只动物吗？");
                System.out.println("1.是 2.否");
                choose=sc.nextInt();
                if (choose==1){
                    System.out.println("卖出的价格为：");
                    double price=sc.nextDouble();
                    this.surplusMoney=this.surplusMoney+price;
                    this.dayDrofit+=price;
                    animals.remove(i);
                    break;
                }
                else{
                    System.out.println("那我们看下一只动物吧！");
                }
                i++;
             }
            }
            else {
            throw new AnimalNotFoundException();
        }
    } catch (AnimalNotFoundException e) {
    }
    }

    @Override
    public void closeShop() {
    int i;
    System.out.println("该宠物店已经歇业了");
    System.out.println("当天光顾的客户信息为：");
    for(i=0;i<customersList.size();i++){
        System.out.println(customersList.get(i).toString());
    }
    System.out.println("当天的利润为：");
    System.out.println(this.dayDrofit);
    customersList.clear();
    this.dayDrofit=0;
    }
}
