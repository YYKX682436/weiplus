package uk;

/* loaded from: classes.dex */
public abstract class n {
    public static int a(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return str.length() <= 0 ? i17 : java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i17;
        }
    }
}
