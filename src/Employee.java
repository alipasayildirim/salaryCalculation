public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;

   public Employee (String name,double salary,int workHours,int hireYear){
       this.name = name;
       this.salary = salary;
       this.workHours = workHours;
       this.hireYear = hireYear;
   }

   void bonus(){
       if (workHours > 40) {
           this.bonus = (workHours - 40) * 30;
       }
   }
   void tax(){
       if (this.salary > 1000){
         this.tax = salary * 0.03;
       } else if (this.salary < 1000) {
           this.tax = 0;
       }
   }

   void raiseSalary(){
       if ((2021 - this.hireYear  ) < 10 ) {
           this.raiseSalary = this.salary * 0.05;
       } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
           this.raiseSalary = this.salary * 0.10;
       } else if (2021 - this.hireYear > 19) {
           this.raiseSalary = this.salary * 0.15;
       }
   }

    void string() {
        System.out.println("--------------------------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary+this.bonus-this.tax));
        System.out.println("Toplam Maaş: " + (this.salary+this.bonus+this.raiseSalary-this.tax));
    }
}
