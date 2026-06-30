package vn2;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final vn2.d1 f438256a = new vn2.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f438257b = jz5.h.b(vn2.c1.f438249d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f438258c = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f438259d = jz5.h.b(vn2.b1.f438243d);

    public final void a(java.lang.String tag, long j17) {
        java.lang.Long l17;
        kotlin.jvm.internal.o.g(tag, "tag");
        if (!((java.lang.Boolean) ((jz5.n) f438257b).getValue()).booleanValue() || (l17 = (java.lang.Long) ((java.util.HashMap) ((jz5.n) f438259d).getValue()).remove(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(tag, "count" + j17 + " time cost=" + (android.os.SystemClock.elapsedRealtime() - l17.longValue()));
    }

    public final long b() {
        if (!((java.lang.Boolean) ((jz5.n) f438257b).getValue()).booleanValue()) {
            return 0L;
        }
        long incrementAndGet = f438258c.incrementAndGet();
        ((java.util.HashMap) ((jz5.n) f438259d).getValue()).put(java.lang.Long.valueOf(incrementAndGet), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return incrementAndGet;
    }
}
