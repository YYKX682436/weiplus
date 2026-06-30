package yr2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static int f464712c = 180000;

    /* renamed from: a, reason: collision with root package name */
    public long f464713a = android.os.SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f464714b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public void a() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127896q9).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for disable");
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f464713a;
        if (uptimeMillis < f464712c) {
            com.tencent.mars.xlog.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for invalid interval:" + uptimeMillis + " < " + f464712c);
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f464714b;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for isRequesting");
            return;
        }
        com.tencent.mars.xlog.Log.i("PreloadGlobalInfoCGIFetcher", "fetch start");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        new bq.k1(new r45.qt2()).l().q(new cq.g1(new yr2.m(this), new yr2.n(this)));
        atomicBoolean.set(true);
    }
}
