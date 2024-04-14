public static List<String> filterOddLengthStrings(List<String> list) {
    List<String> result = new ArrayList<>();
    for (String el : list) {
        if (el.length() % 2 != 0) { // Изменето условот за филтрирање на стринговите со непарна должина
            result.add(el);
        }
    }
    return result;
}
