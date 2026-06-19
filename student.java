class student {

    String name;

    int rollNumber;

    int gradeCount = 0;   

    int[] grades = new int[10];

    student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void addGrade(int grade) {
        if(gradeCount < grades.length) {
            if(grade >= 0 && grade <= 100) {
                this.grades[gradeCount++] = grade;
                System.out.println("~Grade " + grade + " added for student " + this.name);
            }
            else{
                System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
            }
        }
    }

    double calculateAverage() {
        if(gradeCount != 0) {
            int sum = 0;
            for(int i = 0; i < this.gradeCount; i++) {
                sum += this.grades[i];
            }
            return (double)sum / this.gradeCount;
        }
        else{
            System.out.println("No grades available to calculate average.");
            return 0;
        }
    }
     void displayInfo() {
        System.out.println("\nStudent Name: "+ this.name);
        System.out.println("Roll Number: "+ this.rollNumber);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("");
    }

    public static void main(String[] args) {
        student student1 = new student("Krishan", 1225122);
        student1.addGrade(86);
        student1.addGrade(92);
        student1.addGrade(78);
        student1.displayInfo();
    }
}
