package kz5;

/* loaded from: classes5.dex */
public abstract class r {
    public static final void a(int i17, int i18) {
        if (i17 <= i18) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i17 + ") is greater than size (" + i18 + ").");
    }
}
