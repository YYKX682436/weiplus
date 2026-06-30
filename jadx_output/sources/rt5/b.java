package rt5;

/* loaded from: classes12.dex */
public class b implements rt5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f399545a = java.util.concurrent.Executors.newSingleThreadExecutor();

    @Override // rt5.a
    public void submit(java.lang.Runnable runnable) {
        this.f399545a.submit(runnable);
    }
}
