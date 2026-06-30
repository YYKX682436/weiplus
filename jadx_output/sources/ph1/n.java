package ph1;

/* loaded from: classes.dex */
public class n implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.util.Objects.requireNonNull(runnable);
        ((ku5.t0) u0Var).g(runnable);
    }

    public java.lang.String toString() {
        return "ThreadPoolExecutor@" + hashCode();
    }
}
