import java.math.BigDecimal;

public class Worker {
    private String name;
    private BigDecimal salary;

    public Worker(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
