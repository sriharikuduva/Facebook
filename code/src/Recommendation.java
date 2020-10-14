import java.util.Date;

public class Recommendation {
    private Integer recommendationId;
    private int rating;
    private String description;
    private Date createdAt;

    public Integer getRecommendationId() {
        return recommendationId;
    }
    public void setRecommendationId(Integer recommendationId) {
        this.recommendationId = recommendationId;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}