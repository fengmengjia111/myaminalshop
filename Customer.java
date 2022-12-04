public class Customer {
    private String name;
    private int count;
    private LocalDate date;

    public Customer() {}

    public Customer(String name, int count, LocalDate year, LocalDate month, LocalDate date) {
        this.name = name;
        this.count = count;
        this.date = date;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString() {
        return "顾客的名字为:"
                +this.name+"\n"+
                "到店次数为："
                +this.count+"\n"+
                "最新到店时间为:"+
                this.date.toString();
    }
}
