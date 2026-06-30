package xh1;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.networking.c0 {

    /* renamed from: m, reason: collision with root package name */
    public static final xh1.a f454507m = new xh1.a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f454508n = kz5.c1.k(new jz5.l("/cgi-bin/mmbiz-bin/js-authorize", 1157), new jz5.l("/cgi-bin/mmbiz-bin/js-authorize-confirm", java.lang.Integer.valueOf(me1.a.CTRL_INDEX)), new jz5.l("/cgi-bin/mmbiz-bin/js-operatewxdata", 1133));

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f454509d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454510e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f454511f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f454512g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f454513h;

    /* renamed from: i, reason: collision with root package name */
    public final xh1.f f454514i;

    public g(ze.n runtime, com.tencent.mm.plugin.appbrand.networking.c0 originCgiService) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(originCgiService, "originCgiService");
        this.f454509d = runtime;
        this.f454510e = "Luggage.CgiServiceImplByLibServer(" + hashCode() + ')';
        this.f454511f = jz5.h.b(new xh1.c(this));
        this.f454512g = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f454513h = new java.util.concurrent.ConcurrentHashMap();
        this.f454514i = new xh1.f(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object a(xh1.g gVar, java.lang.String str, com.tencent.mm.protobuf.f fVar, java.lang.Class cls, kotlin.coroutines.Continuation continuation) {
        int andIncrement = gVar.f454512g.getAndIncrement();
        com.tencent.mars.xlog.Log.i(gVar.f454510e, "sendToLibServer cgiUrl:" + str + " requestId:" + andIncrement);
        if (fVar instanceof r45.my3) {
            r45.my3 my3Var = (r45.my3) fVar;
            if (my3Var.getBaseRequest() == null) {
                my3Var.setBaseRequest((r45.he) ((jz5.n) gVar.f454511f).getValue());
            }
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        gVar.f454513h.put(new java.lang.Integer(andIncrement), new xh1.b(rVar, cls));
        try {
            com.tencent.luggage.sdk.jsapi.component.service.y C0 = gVar.f454509d.C0();
            if (C0 != null) {
                qe.n nVar = qe.o.f361980i;
                java.lang.Object obj = f454508n.get(str);
                kotlin.jvm.internal.o.d(obj);
                nVar.a(C0, andIncrement, ((java.lang.Number) obj).intValue(), fVar);
            }
        } catch (com.tencent.mm.plugin.appbrand.networking.p e17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17)));
        }
        xh1.f fVar2 = gVar.f454514i;
        fVar2.getClass();
        kotlin.jvm.internal.o.e(java.lang.Integer.valueOf(andIncrement), "null cannot be cast to non-null type kotlin.Any");
        fVar2.sendMessageDelayed(fVar2.obtainMessage(fVar2.f454505b, java.lang.Integer.valueOf(andIncrement)), fVar2.f454504a);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final void b(int i17) {
        kotlinx.coroutines.q qVar;
        xh1.b bVar = (xh1.b) this.f454513h.remove(java.lang.Integer.valueOf(i17));
        java.lang.String str = this.f454510e;
        if (bVar == null || (qVar = bVar.f454489a) == null) {
            com.tencent.mars.xlog.Log.e(str, "callbackUnsupported missing continuation for requestId:" + i17);
        } else {
            com.tencent.mars.xlog.Log.i(str, "callback 'Unsupported cgi' for requestId:" + i17);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.TRANSFER, -1, "Unsupported cgi", null))));
        }
    }

    public final void c() {
        this.f454514i.removeCallbacksAndMessages(null);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f454513h;
        java.util.Collection<xh1.b> values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (xh1.b bVar : values) {
            if (((kotlinx.coroutines.r) bVar.f454489a).n()) {
                kotlinx.coroutines.p.a(bVar.f454489a, null, 1, null);
            }
        }
        concurrentHashMap.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.c0
    public km5.d e1(java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.f fVar, java.lang.Class cls) {
        if (!f454508n.keySet().contains(str == null ? "" : str) || fVar == null || cls == null) {
            km5.q qVar = new km5.q();
            qVar.x(null);
            return qVar;
        }
        km5.d n17 = ((km5.q) km5.u.d()).n(new xh1.e(this, str, fVar, cls, str2));
        kotlin.jvm.internal.o.f(n17, "next(...)");
        return n17;
    }
}
