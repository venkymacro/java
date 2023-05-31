class STR {
    public void str_cmp_eq(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println(s1 + " is equal to " + s2 + " i.e. same object ref");
        } else {
            System.out.println("not equal");
        }
    }

    public void str_cmp_int(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("same string");
        } else {
            System.out.println("diff strings");
        }
    }
}

class str_comp {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = new String("hi");
        STR obj = new STR();
        obj.str_cmp_eq(s1, s1);
        obj.str_cmp_int(s1, s2);
    }
}
