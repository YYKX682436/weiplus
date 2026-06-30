package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class h2 {
    public static final java.util.concurrent.Executor a(kotlinx.coroutines.p0 p0Var) {
        java.util.concurrent.Executor K;
        kotlinx.coroutines.f2 f2Var = p0Var instanceof kotlinx.coroutines.f2 ? (kotlinx.coroutines.f2) p0Var : null;
        return (f2Var == null || (K = f2Var.K()) == null) ? new kotlinx.coroutines.p1(p0Var) : K;
    }
}
