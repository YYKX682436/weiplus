package u23;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f424097a;

    /* renamed from: b, reason: collision with root package name */
    public volatile u23.o f424098b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u23.q f424099c;

    /* renamed from: d, reason: collision with root package name */
    public volatile u23.p f424100d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f424101e;

    /* renamed from: f, reason: collision with root package name */
    public u23.e f424102f;

    public n(u23.o oVar, u23.q qVar, u23.p pVar) {
        java.lang.String str = "MicroMsg.MediaLoaderQueryController[" + hashCode() + ']';
        this.f424097a = str;
        com.tencent.mars.xlog.Log.i(str, "init: ");
        this.f424098b = oVar;
        this.f424099c = qVar;
        this.f424100d = pVar;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i(this.f424097a, "clear: ");
        this.f424101e = true;
        this.f424098b = null;
        this.f424099c = null;
        this.f424100d = null;
        u23.e eVar = this.f424102f;
        if (eVar != null) {
            com.tencent.mars.xlog.Log.i(eVar.f424044a, "clearCache: ");
            eVar.f424045b = false;
            ((java.util.LinkedHashMap) eVar.f424047d).clear();
            ((java.util.HashMap) eVar.f424048e).clear();
        }
    }

    public final void b(java.util.List result, boolean z17) {
        kotlin.jvm.internal.o.g(result, "result");
        if (this.f424098b != null) {
            if (!z17) {
                t23.p0.n().c(new u23.m(this, result));
                return;
            }
            t23.y0 n17 = t23.p0.n();
            n17.a().postAtFrontOfQueue(new u23.l(this, result));
        }
    }
}
