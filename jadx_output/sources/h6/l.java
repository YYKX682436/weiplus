package h6;

/* loaded from: classes13.dex */
public final class l implements android.content.ComponentCallbacks2, b6.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f279128d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f279129e;

    /* renamed from: f, reason: collision with root package name */
    public final b6.d f279130f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f279131g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f279132h;

    public l(r5.p imageLoader, android.content.Context context, boolean z17) {
        android.net.ConnectivityManager connectivityManager;
        kotlin.jvm.internal.o.g(imageLoader, "imageLoader");
        kotlin.jvm.internal.o.g(context, "context");
        this.f279128d = context;
        this.f279129e = new java.lang.ref.WeakReference(imageLoader);
        int i17 = b6.d.f18120a;
        b6.d dVar = b6.a.f18119b;
        if (z17 && (connectivityManager = (android.net.ConnectivityManager) b3.l.getSystemService(context, android.net.ConnectivityManager.class)) != null) {
            if (b3.l.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    dVar = new b6.f(connectivityManager, this);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f279130f = dVar;
        this.f279131g = dVar.a();
        this.f279132h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f279128d.registerComponentCallbacks(this);
    }

    public final void a() {
        if (this.f279132h.getAndSet(true)) {
            return;
        }
        this.f279128d.unregisterComponentCallbacks(this);
        this.f279130f.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        if (((r5.p) this.f279129e.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        jz5.f0 f0Var;
        r5.p pVar = (r5.p) this.f279129e.get();
        if (pVar == null) {
            f0Var = null;
        } else {
            a6.s sVar = pVar.f392559d;
            sVar.f1690a.a(i17);
            sVar.f1691b.a(i17);
            pVar.f392558c.a(i17);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            a();
        }
    }
}
