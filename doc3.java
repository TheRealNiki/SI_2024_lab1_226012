private static String makeBigStringFrom(List<String> list, int minLength) {
    StringBuilder sb = new StringBuilder();
    for (String el : list) {
        if (el.length() >= minLength) { // Изменето условот за конкатенирање на стринговите со должина најмалку minLength
            sb.append(el);
        }
    }
    return sb.toString();
}

public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        

        // Повик на методот makeBigStringFrom и печатење на резултатот
        System.out.println(SILab1_2.makeBigStringFrom(list, 3)); // Пример за минимална должина на стринговите 3
}