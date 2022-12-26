package HW2;

import java.io.FileWriter;
import java.io.IOException;

public class GroupXmlSaver extends GroupFileSaver{

    @Override
    public void SaveFile(StudentGroup studentGroup) throws IOException {
        try(FileWriter writer = new FileWriter("StudentXmlGroup.xml", false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n<students>\n");
            writer.flush();
                        for (Student student : studentGroup.getGroupList()) {
                String text = "<student>\n<name>" + student.getName() + "</name>\n<grade>" +
                        student.getAvgScore() + "</grade>\n</student>\n";
                writer.write(text);
                writer.flush();
            }
            writer.write("</students>");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
