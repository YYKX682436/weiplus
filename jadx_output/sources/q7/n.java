package q7;

/* loaded from: classes13.dex */
public abstract class n {
    public static void a(boolean z17, java.lang.String str) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static java.lang.Object b(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Argument must not be null");
    }
}
