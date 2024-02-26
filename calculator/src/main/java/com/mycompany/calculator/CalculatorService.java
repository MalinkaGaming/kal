import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public String subtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Ошибка: деление на ноль недопустимо";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}