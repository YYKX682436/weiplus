package rb1;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.util.UUID a(java.lang.String str) {
        int length = str.length();
        if (length == 4) {
            str = "0000" + str + "-0000-1000-8000-00805F9B34FB";
        } else if (length == 8) {
            str = str.concat("-0000-1000-8000-00805F9B34FB");
        } else if (length != 36) {
            throw new java.lang.IllegalArgumentException("Invalid UUID name: ".concat(str));
        }
        return java.util.UUID.fromString(str);
    }
}
