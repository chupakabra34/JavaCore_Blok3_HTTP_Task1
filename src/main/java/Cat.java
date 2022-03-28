import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Cat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
}
