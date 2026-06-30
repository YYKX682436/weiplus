package r51;

/* loaded from: classes15.dex */
public class a implements r51.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f392620a = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();

    @Override // r51.b
    public java.util.concurrent.Future a(java.lang.Runnable runnable, long j17, long j18) {
        return this.f392620a.scheduleWithFixedDelay(runnable, j17, j18, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
