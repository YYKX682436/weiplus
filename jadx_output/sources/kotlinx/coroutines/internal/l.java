package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public abstract class l {
    public static final void a(int i17) {
        if (i17 >= 1) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Expected positive parallelism level, but got " + i17).toString());
    }
}
