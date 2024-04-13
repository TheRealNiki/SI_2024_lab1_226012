private static String makeBigStringFrom(List<String> list, int minLength) {
    StringBuilder sb = new StringBuilder();
    for (String el : list) {
        if (el.length() >= minLength) { // Изменето условот за конкатенирање на стринговите со должина најмалку minLength
            sb.append(el);
        }
    }
    return sb.toString();
}
