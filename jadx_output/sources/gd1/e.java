package gd1;

/* loaded from: classes7.dex */
public abstract class e extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f270492g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f270493h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f270494i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f270495m;

    public e(java.lang.String techName, java.lang.String function, java.lang.String resultKey, yz5.l retConverter) {
        kotlin.jvm.internal.o.g(techName, "techName");
        kotlin.jvm.internal.o.g(function, "function");
        kotlin.jvm.internal.o.g(resultKey, "resultKey");
        kotlin.jvm.internal.o.g(retConverter, "retConverter");
        this.f270492g = techName;
        this.f270493h = function;
        this.f270494i = resultKey;
        this.f270495m = retConverter;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, env is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.t1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.t1.class);
        if (t1Var != null && !((com.tencent.mm.plugin.appbrand.utils.k5) t1Var).a()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f280435c.a(lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, appId: " + lVar.getAppId());
        java.lang.String techName = this.f270492g;
        java.lang.String function = this.f270493h;
        gd1.d dVar = new gd1.d(lVar, i17, this);
        kotlin.jvm.internal.o.g(techName, "techName");
        kotlin.jvm.internal.o.g(function, "function");
        ((ku5.t0) ku5.t0.f312615d).h(new hd1.o(a17, dVar, techName, function, null), "NFC-IO");
    }
}
