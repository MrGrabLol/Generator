import java.util.List;

// FIXME: 13.02.2021 lol
public class Food {

    private String name;
    private int price;
    private String composition;
    private List<Tag> tags;
    private FoodType type;

    public Food() {}

    public Food(String name, int price, String composition, List<Tag> tags, FoodType type) {
        this.name = name;
        this.price = price;
        this.composition = composition;
        this.tags = tags;
        this.type = type;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", composition='" + composition + '\'' +
                '}';
    }
}
