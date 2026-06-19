class course {

    static int maxCapacity;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }
    
    static void setMAxCapacity(int capacity) {
        course.maxCapacity = capacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
         System.out.println(studentName + " enrolled.");
    }

    void unenrollStudent(String studentName) {
        int idx = -1;
        System.out.println("Student removed");
        for(int i = 0; i < enrollments; i++) {
            if(studentName.equals(enrolledStudents[i])) {
                idx=i;
                break;
            }
        }
        for (int i = idx; i<enrollments-1; i++) {
            enrolledStudents[i] = enrolledStudents[i+1];
        }
        enrollments--;
        System.out.println(studentName + " removed.");
    }
    void listStudents() {
        System.out.println("Enrolled students in "+courseName+":");
        for(int i = 0; i < enrollments; i++) {
            System.out.println(" - "+ enrolledStudents[i]);
        }
    }
    public static void main(String[] args) {
        course.setMAxCapacity(8);
        course JEE2026 = new course("JEE Main 2026");
        JEE2026.enrollStudent("Kartik");
        JEE2026.listStudents();
    }
}
