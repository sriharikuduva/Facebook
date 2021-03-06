import java.util.List;

public class Group {
    private Integer groupId;
    private String name, getDescription;
    private String description;
    private int totalMembers;
    private List<Member> members;

    public Integer getGroupId() {
        return groupId;
    }
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGetDescription() {
        return getDescription;
    }
    public void setGetDescription(String getDescription) {
        this.getDescription = getDescription;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalMembers() {
        return totalMembers;
    }
    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}