public class Page {
    private Integer pageId;
    private String name, description, type;
    private int totalMembers;
    private List<Recommendation> recommendation;

    public Integer getPageId() {
        return pageId;
    }
    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getTotalMembers() {
        return totalMembers;
    }
    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public List<Recommendation> getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(List<Recommendation> recommendation) {
        this.recommendation = recommendation;
    }
}