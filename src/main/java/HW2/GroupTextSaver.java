package HW2;

import java.io.FileWriter;
import java.io.IOException;

public class GroupTextSaver extends GroupFileSaver{

    @Override
    public void SaveFile(StudentGroup studentGroup) throws IOException {

            try(FileWriter writer = new FileWriter("StudentTextGroup.txt", false)) {
                for (Student student : studentGroup.getGroupList()) {

                    String text = student.getName() + "=" + student.getAvgScore() + "\n";
                    writer.write(text);
                    writer.flush();
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }

