package HW2;

public class Student {
    private String name;
    private double avgScore;

    public Student(String name, double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
