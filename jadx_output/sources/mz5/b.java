package mz5;

/* loaded from: classes14.dex */
public abstract class b extends mz5.a {
    public static final int c(int i17, int... other) {
        kotlin.jvm.internal.o.g(other, "other");
        for (int i18 : other) {
            i17 = java.lang.Math.min(i17, i18);
        }
        return i17;
    }
}
