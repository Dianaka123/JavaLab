package by.bntu.fitr.povt.tnnf.javalabs.lab10.logic;

import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Company;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Customer;
import by.bntu.fitr.povt.tnnf.javalabs.lab10.entity.Employer;

public class Manager {
    public static int allSalary;
    public static int calculateCommonSalary(Company company){
        for (Employer employer:company.masOfEmployers) {
            allSalary+=employer.salary;
        }
        return allSalary;
    }


    public static int calculateMiddleSalary(Company company){
        return calculateCommonSalary(company)/company.countOfEmployers;
    }
}
