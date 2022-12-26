package HW2;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Иван Иванов", 4.8);
        Student student2 = new Student("Мария Кузнецова", 5.0);
        Student student3 = new Student("Степан Кузьмин", 3.6);
        StudentGroup myGroup = new StudentGroup(Arrays.asList(student1, student2, student3));

        GroupTextSaver gts = new GroupTextSaver();
        gts.SaveFile(myGroup);
        GroupJsonSaver gjs = new GroupJsonSaver();
        gjs.SaveFile(myGroup);
        GroupXmlSaver gxs = new GroupXmlSaver();
        gxs.SaveFile(myGroup);
    }
}