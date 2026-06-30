package ki;

/* loaded from: classes12.dex */
public final class h implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public long f308097d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f308098e;

    public h() {
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new ki.e(this));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f308097d < java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f308098e + 1) || this.f308098e >= 10) {
            oj.j.f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new java.lang.Object[0]);
            return;
        }
        this.f308097d = currentTimeMillis;
        this.f308098e++;
        oj.j.b("Matrix.TrimMemoryNotifier", "onLowMemory post", new java.lang.Object[0]);
        oj.g.a().post(ki.f.f308095d);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 <= 15) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f308097d < java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f308098e + 1) || this.f308098e >= 10) {
                oj.j.f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new java.lang.Object[0]);
                return;
            }
            this.f308097d = currentTimeMillis;
            this.f308098e++;
            oj.j.b("Matrix.TrimMemoryNotifier", "onTrimMemory post: " + i17, new java.lang.Object[0]);
            oj.g.a().post(new ki.g(i17));
        }
    }
}
