package kz5;

/* loaded from: classes5.dex */
public abstract class s1 {
    public static final void a(int i17, int i18) {
        java.lang.String str;
        if (i17 > 0 && i18 > 0) {
            return;
        }
        if (i17 != i18) {
            str = "Both size " + i17 + " and step " + i18 + " must be greater than zero.";
        } else {
            str = "size " + i17 + " must be greater than zero.";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }
}
