package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;


public class GroupJsonSaver extends GroupFileSaver{
    @Override
    public void SaveFile(StudentGroup studentGroup) throws IOException {
        try(FileWriter writer = new FileWriter("StudentJsonGroup.json", false)) {
            writer.write("{\n");
            writer.flush();
            int count = studentGroup.getGroupList().size();
            for (Student student : studentGroup.getGroupList()) {
                String text = '"' + student.getName() + '"' + ":" + student.getAvgScore();
                writer.write(text);
                writer.flush();
                if (count > 1){
                    writer.write(",\n");
                    writer.flush();
                    count -= 1;
                }
            }
            writer.write("\n}");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

