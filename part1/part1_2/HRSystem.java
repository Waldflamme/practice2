package part1.part1_2;

public class HRSystem {
    public static void main(String[] args) {
        // Создаем объект обновленного класса
        EmployeeFixed emp = new EmployeeFixed("Иван", 30, 80000, "secret");

        // Теперь используем геттеры, так как поля private
        System.out.println("Имя: " + emp.getName());            // Было emp.name
        System.out.println("Возраст: " + emp.getAge());         // Было emp.age
        System.out.println("Зарплата: " + emp.getSalary());     // Было emp.salary

        // Доступа к emp.password больше нет вообще — это безопасно

        // Метод getRole и так был public
        System.out.println("Роль: " + emp.getRole());

        // Метод promote теперь public, вызываем его напрямую
        emp.promote(5000);

        // Метод printSummary теперь public
        System.out.println("Данные после повышения:");
        emp.printSummary();

        // Проверка пароля через специальный публичный метод
        boolean isAuthenticated = emp.authenticate("secret");
        System.out.println("Пароль верный? " + isAuthenticated);

        boolean isWrong = emp.authenticate("12345");
        System.out.println("Попытка с неверным паролем: " + isWrong);
    }
}