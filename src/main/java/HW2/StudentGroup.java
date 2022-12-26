package HW2;

import java.util.List;

public class StudentGroup {
    private List<Student> groupList;

    public StudentGroup(List<Student> groupList) {
        this.groupList = groupList;
    }

    public List<Student> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Student> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupList=" + groupList +
                '}';
    }
}
