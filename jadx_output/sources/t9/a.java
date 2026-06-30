package t9;

/* loaded from: classes14.dex */
public abstract class a {
    public static void a(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void b(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static int c(int i17, int i18, int i19) {
        if (i17 < i18 || i17 >= i19) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i17;
    }

    public static void d(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void e(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
