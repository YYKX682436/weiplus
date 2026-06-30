package dz2;

/* loaded from: classes.dex */
public abstract class a {
    public static final java.lang.CharSequence a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() == 0) {
            return "";
        }
        int i18 = i17 / 2;
        if (i18 <= 0 || str.length() - i18 <= 0) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = str.substring(0, i18);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append("...");
        java.lang.String substring2 = str.substring(str.length() - i18, str.length());
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        return sb6.toString();
    }
}
