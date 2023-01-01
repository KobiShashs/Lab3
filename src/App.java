import java.util.List;
import java.util.Map;

/**
 * Created by kobis on 01 Jan, 2023
 */
public class App {

    public static void main(String[] args) {
        // TODO: Start with Task 1 & 2 in The *Repository* Class.
        List<String> hobbit = Repository.readFromFileUsingIOAPI();
        //List<String> hobbit = Repository.readFromFileUsingStreamAPI();

        // TODO: Task 3 - Show word count


        // TODO: Task 4 - Show unique word count


        // TODO: Task 5 - Show first word


        // TODO: Task 6 - Show any word


        // TODO: Task 7 - Sort uniques and show first


        // TODO: Task 8 - Sort uniques in the opposite order and show first


        // TODO: Task 9 - perform stream match operations


        // TODO: Task 10 - show how many words are shorter than 3 letters


        // TODO: Task 11 - show sum of unique length


        // TODO: Task 12 - show sum of unique length


        // TODO: Task 13 - show avg of words length, if there is no any word return 0


        // TODO: Task 14 - show the minimum length word, if there is no any word return -1


        // TODO: Task 15 - show the maximus length word, if there is no any word return -1


        // TODO: Task 16 - show longest word, if there more then one return first, otherwise return "Not Found"


        // TODO: Task 17 - show shortest word, if there more then one return first, otherwise return "Not Found"

        // TODO: Start with Task 18 in The *MapUtils* Class and print the map here
        Map<Character,List<String>> map1 = MapUtils.groupWordsByFirstLetter(hobbit);
        map1.forEach((key, value) -> {
            System.out.println("Character : " + key);
            System.out.println("List : ");
            value.forEach(System.out::println);
        });

        // TODO: Start with Task 19 in The *MapUtils* Class and print the map here
        Map<Character,Long> map2 = MapUtils.groupNumOccurrencesByFirstLetter(hobbit);
        map2.forEach((key, value) -> {
            System.out.println("Character : " + key);
            System.out.println("Occurrences : "+ value);
        });

        // TODO: Start with Task 20 in The *StorytellingUtils* Class and print the map here
        StorytellingUtils.tellStory(hobbit,10);



    }
}
