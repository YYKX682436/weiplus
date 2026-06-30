package vu0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f440149a;

    /* renamed from: b, reason: collision with root package name */
    public final xu0.a f440150b;

    /* renamed from: c, reason: collision with root package name */
    public final vu0.r f440151c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440152d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440153e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440154f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440155g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440156h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f440157i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440158j;

    public s(pp0.s0 s0Var, xu0.a requestListener) {
        kotlin.jvm.internal.o.g(requestListener, "requestListener");
        this.f440149a = s0Var;
        this.f440150b = requestListener;
        this.f440151c = new vu0.r(this);
        this.f440152d = jz5.h.b(new vu0.n(this));
        this.f440153e = jz5.h.b(new vu0.o(this));
        this.f440154f = new java.util.concurrent.ConcurrentHashMap();
        this.f440155g = new java.util.concurrent.ConcurrentHashMap();
        this.f440156h = new java.util.concurrent.ConcurrentHashMap();
        this.f440157i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f440158j = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f440156h;
        for (kotlinx.coroutines.r2 r2Var : concurrentHashMap.values()) {
            kotlin.jvm.internal.o.d(r2Var);
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        concurrentHashMap.clear();
        su0.j jVar = (su0.j) ((jz5.n) this.f440152d).getValue();
        if (jVar != null) {
            jVar.cancel();
        }
        this.f440154f.clear();
        this.f440155g.clear();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] bytes = (str3 + '_' + str + '_' + str2).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        return g17;
    }

    public final java.lang.String c(java.util.List list) {
        while (true) {
            java.lang.String str = "";
            for (java.lang.Object obj : list) {
                if (obj instanceof vu0.l) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    vu0.l lVar = (vu0.l) obj;
                    sb6.append(lVar.f440115b.getText());
                    com.tencent.maas.model.time.MJTimeRange timeRange = lVar.f440115b.getTimeRange();
                    kotlin.jvm.internal.o.f(timeRange, "getTimeRange(...)");
                    sb6.append(dx0.o.c(timeRange));
                    str = sb6.toString();
                } else if (obj instanceof com.tencent.maas.moviecomposing.segments.CaptionItem) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str);
                    com.tencent.maas.moviecomposing.segments.CaptionItem captionItem = (com.tencent.maas.moviecomposing.segments.CaptionItem) obj;
                    sb7.append(captionItem.getText());
                    com.tencent.maas.model.time.MJTimeRange timeRange2 = captionItem.getTimeRange();
                    kotlin.jvm.internal.o.f(timeRange2, "getTimeRange(...)");
                    sb7.append(dx0.o.c(timeRange2));
                    str = sb7.toString();
                }
            }
            return str;
        }
    }

    public final void d(ru0.d dVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f440156h;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) concurrentHashMap.get(dVar);
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        concurrentHashMap.remove(dVar);
        this.f440154f.remove(dVar);
        this.f440155g.remove(dVar);
    }
}
