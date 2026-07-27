class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public void printPerson() {
        System.out.println(" Name: " + lastName + ", " + firstName);
        System.out.println(" ID: " + idNumber);
    }
}
class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber); // call Person constructor
        this.testScores = testScores;
    }
    public char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int avg = sum / testScores.length;

        if (avg >= 90 && avg <= 100) return 'O';
        else if (avg >= 80) return 'E';
        else if (avg >= 70) return 'A';
        else if (avg >= 55) return 'P';
        else if (avg >= 40) return 'D';
        else return 'T';
    }
}
