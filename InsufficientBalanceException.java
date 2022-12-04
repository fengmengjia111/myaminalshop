public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
        System.out.println("余额不足");
    }
}
