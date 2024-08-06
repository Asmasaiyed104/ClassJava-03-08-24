public class Main {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();

        coffee.drink();
        coffee.boilingCoffee();

        System.out.println(coffee.numOfCup);
        System.out.println(coffee.brand);

   // Car Object

        Car car = new Car();
        car.racingCar();
        car.drive();
        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.speed);

// Employee object

        Employee employee = new Employee();
        employee.leadDeveloperEmployee();
        employee.workingItDepartment();

        System.out.println(employee.employee_id);



        // rectangle

        Rectangle r1 = new Rectangle(),r2 = new Rectangle();
        r1.insert(11, 3);
        r2.insert(23, 16);
        r1.calculateArea();
        r2.calculateArea();

    }
}
