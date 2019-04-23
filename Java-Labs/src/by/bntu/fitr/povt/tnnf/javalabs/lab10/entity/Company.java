package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

import java.util.Arrays;

public class Company {
    private static final int DEFAULT_EMPOLOER_AMOUNT = 5;


    private Employer[] masOfEmployers = new Employer[DEFAULT_EMPOLOER_AMOUNT];
    private int countOfEmployers = 0;
    private String name;

    private int salaryOfEmp;
    private int bonus;

    public StatAboutEmpSalary statAboutEmpSalary = new StatAboutEmpSalary();


    public Company(String name) {
        this.name = name;
    }

    public void addEmployer(Employer emp1) {
        masOfEmployers[countOfEmployers++] = emp1;
        statAboutEmpSalary.addEmployer(emp1);
    }


    public Company(Company company) {
        this.name = company.name;
        this.countOfEmployers = company.countOfEmployers;
        this.masOfEmployers = company.masOfEmployers;
        this.salaryOfEmp = company.salaryOfEmp;
        this.bonus = company.bonus;
    }

    public Employer getEmployer(int indexPerson){
        return masOfEmployers[indexPerson];
    }

    public Employer[] getMasOfEmployers() {
        return masOfEmployers;
    }

    public void setMasOfEmployers(Employer[] masOfEmployers) {
        this.masOfEmployers = masOfEmployers;
    }

    public void giveSalary(int middleSalary){
        for (Employer employer:masOfEmployers
        ) { employer.setSalary(middleSalary);

        }
    }

    public void doBonus(Employer employer){
        int newSalary = employer.getSalary()  + 100;
        employer.setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "Company{" +
                "masOfEmployers=" + Arrays.toString(masOfEmployers) +
                ", countOfEmployers=" + countOfEmployers +
                ", name='" + name + '\'' +
                ", salaryOfEmp=" + salaryOfEmp +
                ", bonus=" + bonus +
                '}';
    }

}