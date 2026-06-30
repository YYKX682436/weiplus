package rk0;

/* loaded from: classes7.dex */
public abstract class d {
    public static final java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (!str.contains(":") && str.length() >= 1) {
            return str;
        }
        java.lang.String[] split = str.split(":");
        java.lang.String str3 = split[0];
        return (str3 == null || str3.length() <= 0) ? str2 : split[0];
    }
}
