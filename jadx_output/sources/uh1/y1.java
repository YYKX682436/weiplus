package uh1;

/* loaded from: classes13.dex */
public abstract class y1 {

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.Network f427940b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f427939a = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f427941c = jz5.h.b(uh1.s1.f427902d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427942d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f427943e = jz5.h.b(new uh1.u1(this));

    /* renamed from: f, reason: collision with root package name */
    public volatile long f427944f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f427945g = jz5.h.b(new uh1.x1(this));

    public y1(kotlin.jvm.internal.i iVar) {
    }

    public abstract android.net.NetworkRequest a();

    public final void b(uh1.p1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.net.Network network = this.f427940b;
        if (network != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "provide, curNetwork not null");
            callback.a(network);
            return;
        }
        this.f427939a.add(callback);
        ((ku5.t0) ku5.t0.f312615d).k(new uh1.v1(this, callback), 4000L);
        this.f427944f = android.os.SystemClock.uptimeMillis() + 30000;
        if (this.f427942d.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "doRequest, requestNetwork");
            try {
                ((android.net.ConnectivityManager) ((jz5.n) this.f427941c).getValue()).requestNetwork(a(), (uh1.t1) ((jz5.n) this.f427943e).getValue());
                ((ku5.t0) ku5.t0.f312615d).k((java.lang.Runnable) ((jz5.n) this.f427945g).getValue(), 30000L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkProvider", "doRequest, requestNetwork fail since " + e17);
                this.f427942d.set(false);
            }
        }
    }
}
