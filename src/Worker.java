import java.math.BigDecimal;

public class Worker {
    private String name;
    private BigDecimal salary;

    public Worker() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
