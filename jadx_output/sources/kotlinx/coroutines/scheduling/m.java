package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class m extends kotlinx.coroutines.scheduling.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f310613d;

    public m(java.lang.Runnable runnable, long j17, kotlinx.coroutines.scheduling.k kVar) {
        super(j17, kVar);
        this.f310613d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f310613d.run();
        } finally {
            this.taskContext.getClass();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.f310613d;
        sb6.append(runnable.getClass().getSimpleName());
        sb6.append('@');
        sb6.append(kotlinx.coroutines.c1.a(runnable));
        sb6.append(", ");
        sb6.append(this.submissionTime);
        sb6.append(", ");
        sb6.append(this.taskContext);
        sb6.append(']');
        return sb6.toString();
    }
}
