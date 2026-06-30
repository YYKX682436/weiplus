package ni;

/* loaded from: classes12.dex */
public class i extends ni.e implements com.tencent.matrix.lifecycle.k {

    /* renamed from: e, reason: collision with root package name */
    public final long f337179e;

    /* renamed from: g, reason: collision with root package name */
    public ni.h f337181g;

    /* renamed from: h, reason: collision with root package name */
    public ni.g f337182h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f337183i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f337184m = new ni.f(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f337180f = new android.os.Handler(pi.d.f354497d.getLooper());

    public i(long j17) {
        this.f337179e = j17;
    }

    public void a(android.app.Application application) {
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.observeForever(this);
        application.registerActivityLifecycleCallbacks(this);
        oj.j.c("matrix.LeakMonitorDefault", "start", new java.lang.Object[0]);
        android.app.Activity a17 = pi.b.a();
        if (a17 != null) {
            ni.d dVar = new ni.d(this, a17.hashCode(), new ni.c());
            dVar.b();
            synchronized (this.f337177d) {
                ((java.util.LinkedList) this.f337177d).add(dVar);
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f337180f.removeCallbacks(this.f337184m);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f337180f.postDelayed(this.f337184m, this.f337179e);
    }
}
