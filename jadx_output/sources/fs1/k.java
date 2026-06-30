package fs1;

/* loaded from: classes7.dex */
public final class k extends sd.l0 implements sd.a {

    /* renamed from: f, reason: collision with root package name */
    public static final fs1.k f266296f = new fs1.k();

    /* renamed from: g, reason: collision with root package name */
    public static fs1.j f266297g;

    public static final void h(com.tencent.mm.plugin.appbrand.jsruntime.r context, java.lang.String str, yz5.p initCallback, mu4.h0 contextReporter) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initCallback, "initCallback");
        kotlin.jvm.internal.o.g(contextReporter, "contextReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePrefetchJsCoreAdapter", "initGameJsPrefetchJsCore");
        fs1.j.f266292e = context;
        fs1.j jVar = fs1.j.f266291d;
        fs1.j.f266293f = new od.l(jVar);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new fs1.h(contextReporter, initCallback, str, null), 3, null);
        f266297g = jVar;
        java.util.ArrayList arrayList = gs1.a.f275047a;
        fs1.k runtime = f266296f;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        try {
            ((com.tencent.mm.plugin.game.luggage.e0) ((s43.k) i95.n0.c(s43.k.class))).getClass();
            synchronized (h53.k.class) {
                h53.k.f279060a = new java.util.LinkedList();
                h53.k.b();
                linkedList = h53.k.f279060a;
            }
            for (java.lang.Class cls : new java.util.LinkedList(linkedList)) {
                kotlin.jvm.internal.o.e(cls, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                runtime.f(cls, runtime);
            }
            for (java.lang.Class cls2 : gs1.a.f275047a) {
                kotlin.jvm.internal.o.e(cls2, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                runtime.f(cls2, runtime);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GamePrefetchJsApiPool", e17, "[game-web-prefetch] init jsApiPool exception", new java.lang.Object[0]);
        }
    }

    @Override // sd.l0
    public od.l d() {
        if (f266297g != null) {
            return fs1.j.f266293f;
        }
        kotlin.jvm.internal.o.o("jsCore");
        throw null;
    }

    @Override // sd.l0
    public java.lang.String e() {
        fs1.j jVar = f266297g;
        if (jVar != null) {
            java.lang.String userAgent = jVar.getUserAgent();
            return userAgent == null ? "" : userAgent;
        }
        kotlin.jvm.internal.o.o("jsCore");
        throw null;
    }

    @Override // sd.a
    public android.content.Context getContext() {
        if (f266297g != null) {
            return null;
        }
        kotlin.jvm.internal.o.o("jsCore");
        throw null;
    }

    @Override // sd.a
    public sd.l0 getRuntime() {
        return this;
    }
}
