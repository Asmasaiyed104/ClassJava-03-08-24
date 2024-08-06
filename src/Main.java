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


        // student object
        Student student = new Student();
        // initialize with reference variable
        student.student_id = 234565;
        student.student_name="Asma";
        student.student_email="az104@gmail.com";
        System.out.println(student.student_name +  " " +student.student_id + " " +student.student_email );
    }
}
