package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, ArrayList> phoneBook = new HashMap<>() {
        {
            put("Чернобровая", new ArrayList<Integer>() {
                {
                    add(9874369);
                    add(8769876);
                    add(5432543);
                }
            });
            put("Лютиков", new ArrayList<Integer>() {
                {
                    add(876789);
                }
            });
            put("Остроглазов", new ArrayList<Integer>() {
                {
                    add(7654765);
                    add(6987698);

                }
            });
            put("Крупноходова", new ArrayList<Integer>() {
                {
                    add(987668);
                    add(209875);
                    add(654779);
                    add(987623);
                }
            });
        }
    };

    public void addInfo(String[] nameAndPhone) {
        if (phoneBook.containsKey(nameAndPhone[0])) {
            List<String> list;
            list = phoneBook.get(nameAndPhone[0]);
            list.add(nameAndPhone[1]);

        } else {
            List<String> list = new ArrayList<>();
            list.add(nameAndPhone[1]);
            phoneBook.put(nameAndPhone[0], (ArrayList) list);
        }
    }

    public void showBook() {
        StringBuilder stringbuilder = new StringBuilder();
        for (Map.Entry<String, ArrayList> entry : phoneBook.entrySet()) {
            stringbuilder.append(entry.getKey());
            stringbuilder.append(" : ");
            stringbuilder.append(entry.getValue());
            stringbuilder.append("\n");
        }
        System.out.println(stringbuilder);
    }

    public void sortBook() {
        StringBuilder stringbuilder = new StringBuilder();
        int minValue = 1_000_000;
        int maxValue = 0;
        for (var entry : phoneBook.entrySet()) {
            if (minValue > entry.getValue().size()) {
                minValue = entry.getValue().size();
            }
            if (maxValue < entry.getValue().size()) {
                maxValue = entry.getValue().size();
            }
        }
        int index = maxValue;
        System.out.println(index);
        while (index >= minValue) {
            for (var entry : phoneBook.entrySet()) {
                if (entry.getValue().size() == index) {
                    stringbuilder.append(entry.getKey());
                    stringbuilder.append(" : ");
                    stringbuilder.append(entry.getValue());
                    stringbuilder.append("\n");
                }
            }
            index--;
        }
        System.out.println(stringbuilder);
    }
}
