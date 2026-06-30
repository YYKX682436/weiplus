package t2;

/* loaded from: classes.dex */
public enum q implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "DirectExecutor";
    }
}
