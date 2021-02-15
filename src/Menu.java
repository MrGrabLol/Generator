import java.util.*;

public class Menu {

    public static ArrayList<Food> createDishesNow() {
        ArrayList<Food> list = new ArrayList<>();

        list.add(new Food("Том Ям", 499, "Кокосовое молоко и тд", Arrays.asList(Tag.SPICY, Tag.FISH), FoodType.SOUP));
        list.add(new Food("Мисосуп", 199, "Соя и тд", Arrays.asList(Tag.VEGAN), FoodType.SOUP));
        list.add(new Food("Солянка", 299, "Оливки и тд", Arrays.asList(Tag.MEAT, Tag.CHICKEN), FoodType.SOUP));
        list.add(new Food("Веган-суп", 249, "Овощи и тд", Arrays.asList(Tag.VEGAN, Tag.SPICY, Tag.SWEET), FoodType.SOUP));
        list.add(new Food("Борщ", 249, "Свекла и тд", Arrays.asList(Tag.MEAT, Tag.CHICKEN), FoodType.SOUP));
        list.add(new Food("Суп похмельный", 349, "Водка и тд", Arrays.asList(Tag.MEAT, Tag.ALCOHOL), FoodType.SOUP));

        list.add(new Food("Утка по Пекински", 5999, "Утка и тд", Arrays.asList(Tag.CHICKEN, Tag.SPICY), FoodType.SECOND));
        list.add(new Food("Золотая пицца", 30000, "Тесто и тд", Arrays.asList(Tag.SPICY, Tag.MEAT, Tag.CHICKEN), FoodType.SECOND));
        list.add(new Food("Веган-бургер", 599, "Соевая котлета и тд", Arrays.asList(Tag.SPICY, Tag.VEGAN), FoodType.SECOND));
        list.add(new Food("Рис с мраморной говядиной", 499, "Рис и тд", Arrays.asList(Tag.SPICY, Tag.MEAT), FoodType.SECOND));
        list.add(new Food("Мидии в чесночном соусе", 999, "Мидии и тд", Arrays.asList(Tag.SPICY, Tag.FISH), FoodType.SECOND));
        list.add(new Food("Бифштекс", 699, "Говядина и тд", Arrays.asList(Tag.SPICY, Tag.MEAT), FoodType.SECOND));
        list.add(new Food("Курица с сыром", 499, "Курица и тд", Arrays.asList(Tag.CHICKEN), FoodType.SECOND));

        list.add(new Food("Чука", 279, "Чука и тд", Arrays.asList(Tag.VEGAN), FoodType.SNACKS));
        list.add(new Food("Оливье", 229, "Картошка и тд", Arrays.asList(Tag.CHICKEN, Tag.MEAT), FoodType.SNACKS));
        list.add(new Food("Цезарь", 299, "Курица и тд", Arrays.asList(Tag.CHICKEN), FoodType.SNACKS));
        list.add(new Food("Греческий салат", 219, "Оливки и тд", Arrays.asList(Tag.SPICY, Tag.MEAT, Tag.VEGAN), FoodType.SNACKS));
        list.add(new Food("Лосось", 399, "Лосось и тд", Arrays.asList(Tag.FISH), FoodType.SNACKS));

        list.add(new Food("Торт", 899, "Сахар и тд", Arrays.asList(Tag.SWEET), FoodType.DESSERTS));
        list.add(new Food("Апельсиновый смуззи", 399, "Апельсин и тд", Arrays.asList(Tag.VEGAN, Tag.SWEET), FoodType.DESSERTS));
        list.add(new Food("Шоколадный маффин", 349, "Шоколад и тд", Arrays.asList(Tag.SWEET), FoodType.DESSERTS));

        list.add(new Food("Милкшейк", 399, "Молоко и тд", Arrays.asList(Tag.SWEET, Tag.DRINK), FoodType.DRINKS));
        list.add(new Food("Чай Пуэр", 999, "Чай Пуэр", Arrays.asList(Tag.HOTDRINK), FoodType.DRINKS));
        list.add(new Food("Кофе", 499, "Кофе", Arrays.asList(Tag.HOTDRINK), FoodType.DRINKS));
        list.add(new Food("Вода", 99, "Вода 0.5", Arrays.asList(Tag.DRINK), FoodType.DRINKS));
        list.add(new Food("Кола", 139, "Кола 0.5", Arrays.asList(Tag.DRINK, Tag.SWEET), FoodType.DRINKS));
        list.add(new Food("Спрайт", 139, "Спрайт 0.5", Arrays.asList(Tag.DRINK, Tag.SWEET), FoodType.DRINKS));

        list.add(new Food("Абсент", 399, "Абсент шот", Arrays.asList(Tag.ALCOHOL, Tag.HOTDRINK), FoodType.ALCOHOL_DRINKS));
        list.add(new Food("Егермайстер", 299, "Егермайстер шот", Arrays.asList(Tag.SPICY, Tag.ALCOHOL, Tag.DRINK, Tag.SWEET), FoodType.ALCOHOL_DRINKS));
        list.add(new Food("Виски", 799, "Виски стакан", Arrays.asList(Tag.ALCOHOL, Tag.DRINK), FoodType.ALCOHOL_DRINKS));
        list.add(new Food("Вино", 699, "Вино бокал", Arrays.asList(Tag.ALCOHOL, Tag.DRINK), FoodType.ALCOHOL_DRINKS));
        list.add(new Food("Шампанское", 599, "Шампанское бокал", Arrays.asList(Tag.ALCOHOL, Tag.DRINK), FoodType.ALCOHOL_DRINKS));
        list.add(new Food("Коктейль", 699, "Коктейль самодельный бокал", Arrays.asList(Tag.SPICY, Tag.ALCOHOL, Tag.DRINK, Tag.HOTDRINK, Tag.SWEET), FoodType.ALCOHOL_DRINKS));
        return list;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            ArrayList<Food> orderList = createDishesNow();
            System.out.println("Выберите категорию(-и) блюд: ");
            System.out.println("Супы - 1, второе - 2, снэки - 3, десерт - 4, дринкс - 5, алкоголь - 6. " +
                               "Чтобы прекратить ввод, введите 0. Ваш выбор?");
            int[] typeArray = new int[6];
            int counter = 0;
            for (int i = 0; i < 6; i++) {
                int temp = sc.nextInt();
                if (temp != 0) {
                    typeArray[i] = temp;
                    counter++;
                } else {
                    break;
                }
            }
            int[] typeArray2 = Arrays.copyOfRange(typeArray, 0, counter);
            Set<FoodType> types = new HashSet<>();
            for (int i : typeArray2) {
                switch (i) {
                    case 1 -> types.add(FoodType.SOUP);
                    case 2 -> types.add(FoodType.SECOND);
                    case 3 -> types.add(FoodType.SNACKS);
                    case 4 -> types.add(FoodType.DESSERTS);
                    case 5 -> types.add(FoodType.DRINKS);
                    case 6 -> types.add(FoodType.ALCOHOL_DRINKS);
                    default -> System.out.println();
                }
            }
            System.out.println("Выберите подходящие тэги: 1 - со специями, 2 - алкоголь, 3 - веган, " +
                    "4 - мясо, 5 - птица, 6 - рыба, 7 - сладкое, 8 - горячий напиток, 9 - напиток. " +
                    "Чтобы прекратить ввод, введите 0. Ваш выбор?");
            int counter2 = 0;
            int[] tagArray = new int[9];
            for (int i = 0; i < 9; i++) {
                int temp = sc.nextInt();
                if (temp != 0) {
                    tagArray[i] = temp;
                    counter2++;
                } else {
                    break;
                }
            }
            int[] tagArray2 = Arrays.copyOfRange(tagArray, 0, counter2);
            Set<Tag> tags = new HashSet<>();
            for (int i : tagArray2) {
                switch (i) {
                    case 1 -> tags.add(Tag.SPICY);
                    case 2 -> tags.add(Tag.ALCOHOL);
                    case 3 -> tags.add(Tag.VEGAN);
                    case 4 -> tags.add(Tag.MEAT);
                    case 5 -> tags.add(Tag.CHICKEN);
                    case 6 -> tags.add(Tag.FISH);
                    case 7 -> tags.add(Tag.SWEET);
                    case 8 -> tags.add(Tag.HOTDRINK);
                    case 9 -> tags.add(Tag.DRINK);
                    default -> System.out.println();
                }
            }
            Set<Food> output = new HashSet<>();
            for (FoodType i : types) {
                HashSet<Food> newSet = new HashSet<>();
                for (Tag j : tags) {
                    for (Food temp : orderList) {
                        if (temp.getType() == i && temp.getTags().contains(j)) {
                            newSet.add(temp);
                        }
                    }
                }
                ArrayList<Food> tempSet = new ArrayList<>(newSet);
                Random random = new Random();
                output.add(tempSet.get(random.nextInt(tempSet.size())));
            }

            output.forEach(System.out::println);

        }
    }

}
