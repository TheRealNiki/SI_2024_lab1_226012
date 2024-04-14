public static List<String> filterOddLengthStrings(List<String> list) {
    List<String> result = new ArrayList<>();
    for (String el : list) {
        if (el.length() % 2 != 0) { // Изменето условот за филтрирање на стринговите со непарна должина
            result.add(el);
        }
    }
<<<<<<< HEAD
    return result;
}
=======
    
    return result;
}

public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");

    System.out.println(filterOddLengthStrings(list)); // Печатење на резултатот
}
>>>>>>> bug2
