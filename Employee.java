public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    double tax() {

        if (this.salary <= 1000) {
            return 0;     // vergi uygulamaz.
        } else {
            return this.salary * 0.03;  // %3 vergi uygular.
        }

    }

    double bonus() {

        int standardWorkHours = 40;
        double bonusPerHour = 30;
        if (this.workHours < standardWorkHours) {

            return 0; //çalışma saati 40 saatten az ise bonus almaz.

        } else {

            return (this.workHours - standardWorkHours) * bonusPerHour;  ////çalışma saati 40 saatten fazla ise bonus hesaplar.
        }

    }

    void raiseSalary() {
        double raiseSalary=0;
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            raiseSalary = this.salary*0.05; // %5 zam yapılır

        } else if (yearsWorked >=10 && yearsWorked < 20)
        {
            raiseSalary = this.salary*0.10; // %10 zam yapılır
        }
        else {
             raiseSalary = this.salary * 0.15; // %15 zam yapılır
        }
        System.out.println("Maaş Artışı "+raiseSalary);
        System.out.println("Toplam Maaş : "+ (raiseSalary+this.salary));

    }

    String to_String() {
        return "Name: " + this.name +
                ", Salary: " + this.salary +
                ", Work Hours: " + this.workHours +
                ", Hire Year: " + this.hireYear;
    }

    void print(){

        System.out.println("Adı : "+this.name );
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : "+ this.bonus());
        System.out.println("Vergi ve Bonuslar İle Maaş : "+(this.salary+this.bonus()-this.tax()));



    }


}