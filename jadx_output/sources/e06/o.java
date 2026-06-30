package e06;

/* loaded from: classes3.dex */
public abstract class o {
    public static final void a(boolean z17, java.lang.Number step) {
        kotlin.jvm.internal.o.g(step, "step");
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
