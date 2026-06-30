package ds1;

/* loaded from: classes7.dex */
public final class j extends nu4.c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f242845i = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsruntime.r f242846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f242847d;

    /* renamed from: e, reason: collision with root package name */
    public final mu4.x0 f242848e = new mu4.x0(1477);

    /* renamed from: f, reason: collision with root package name */
    public final mu4.h0 f242849f = new mu4.h0(1696, mu4.g0.f331413f);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f242850g = "__Game_Prefetcher_FakeAppId";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f242851h = "GameWebPrefetcher";

    static {
        new ds1.d(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initGameWebPrefetcherJsEngineInterceptor open: true");
    }

    @Override // nu4.c0
    public boolean a(int i17, java.lang.String str, yz5.l onCompleted) {
        kotlin.jvm.internal.o.g(onCompleted, "onCompleted");
        if (i17 != 2) {
            return false;
        }
        if (this.f242846c != null) {
            onCompleted.invoke(java.lang.Boolean.TRUE);
            return true;
        }
        this.f242846c = c().t0();
        java.lang.String contextName = this.f242851h;
        java.lang.String appId = this.f242850g;
        mu4.x0 x0Var = this.f242848e;
        mu4.h0 h0Var = this.f242849f;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext for game");
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = this.f242846c;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext not created");
            onCompleted.invoke(java.lang.Boolean.FALSE);
            return true;
        }
        try {
            ds1.a aVar = new ds1.a(new ds1.e());
            com.tencent.mm.plugin.appbrand.jsruntime.r rVar2 = this.f242846c;
            kotlin.jvm.internal.o.d(rVar2);
            aVar.a(rVar2);
            x0Var.a(new mu4.k0());
            h0Var.a(new mu4.d0());
            try {
                rVar.setJsExceptionHandler(new ds1.g(rVar, this));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameWebPrefetcherJsEngineInterceptor", e17, "setJsExceptionHandler", new java.lang.Object[0]);
                h0Var.a(new mu4.z());
                java.lang.String message = e17.getMessage();
                jx3.f.INSTANCE.d(20821, appId, contextName, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                onCompleted.invoke(java.lang.Boolean.FALSE);
            }
            fs1.k kVar = fs1.k.f266296f;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(contextName, "contextName");
            fs1.j.f266294g = appId;
            fs1.j.f266295h = contextName;
            com.tencent.mm.plugin.appbrand.jsruntime.r rVar3 = this.f242846c;
            kotlin.jvm.internal.o.d(rVar3);
            fs1.k.h(rVar3, str, new ds1.i(this, onCompleted), h0Var);
            x0Var.a(new mu4.l0());
            h0Var.a(new mu4.e0());
            return true;
        } catch (java.lang.Exception e18) {
            x0Var.a(new mu4.i0());
            h0Var.a(new mu4.y());
            java.lang.String message2 = e18.getMessage();
            jx3.f.INSTANCE.d(20821, appId, contextName, message2 != null ? r26.i0.u(message2, ',', '.', false, 4, null) : null);
            onCompleted.invoke(java.lang.Boolean.FALSE);
            return true;
        }
    }

    @Override // nu4.c0
    public boolean b(java.lang.String str, java.lang.String str2, java.lang.String event, java.lang.String str3) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        if ((str2 == null || hy4.i.i(str2)) ? false : true) {
            return false;
        }
        if (!this.f242847d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "dispatchEvent jsContext not init url: " + str2 + ", event: " + event);
            return false;
        }
        if (kotlin.jvm.internal.o.b(event, "urlExposed")) {
            ((ku5.t0) ku5.t0.f312615d).h(new ds1.c(new ds1.f(this, str2)), "MicroMsg.GameWebPrefetcherJsEngineInterceptor");
            return true;
        }
        if (str3 == null) {
            str3 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
        od.l lVar = fs1.j.f266293f;
        if (lVar != null) {
            lVar.f344518c.a(new od.d(event, jSONObject));
        }
        return true;
    }
}
