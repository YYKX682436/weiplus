package zl2;

/* loaded from: classes3.dex */
public abstract class s4 {
    public static final int a(r45.be6 be6Var) {
        kotlin.jvm.internal.o.g(be6Var, "<this>");
        long j17 = ((int) be6Var.getLong(3)) - (java.lang.System.currentTimeMillis() / 1000);
        if (j17 < 0) {
            return 0;
        }
        return (int) j17;
    }
}
