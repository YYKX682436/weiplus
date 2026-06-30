package ph1;

/* loaded from: classes.dex */
public class m implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        runnable.run();
    }

    public java.lang.String toString() {
        return "ImmediateExecutor@" + hashCode();
    }
}
