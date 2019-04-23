package by.bntu.fitr.povt.tnnf.javalabs.lab10.entity;

public class StatAboutEmpSalary {
        private static final int FIRSTRANGE = 100;
        private static final int SECONDRANGE = 300;

        private Employer[][] topSalary = new Employer[3][5];

        private int countOnFirstLine = 0;
        private int countOnSecondLine = 0;
        private int countOnThirdLine = 0;

        public void addEmployer(Employer employer){
            if ( employer.getSalary() <FIRSTRANGE){
                topSalary[0][countOnFirstLine++] = employer;
            }
            else if (employer.getSalary() <SECONDRANGE ){
                topSalary[1][countOnSecondLine++] = employer;
            }
            else{
                topSalary[2][countOnThirdLine++] = employer;
            }
        }

        public StringBuffer getLine(int number){
            int countInLine;
            StringBuffer mass = new StringBuffer();
            if (number == 1){
                countInLine = countOnFirstLine;
            } else if(number == 2){
                countInLine = countOnSecondLine;
            } else {
                countInLine = countOnThirdLine;
            }
            for (int i = 0; i < countInLine; i++){
                mass.append(topSalary[number-1][i] + "\n");
            }
            return mass;
        }
    }

