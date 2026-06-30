package gd1;

/* loaded from: classes7.dex */
public abstract class b extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f270482g;

    public b(yz5.q function) {
        kotlin.jvm.internal.o.g(function, "function");
        this.f270482g = function;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "invoke, data is null");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.t1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.t1.class);
        if (t1Var != null && !((com.tencent.mm.plugin.appbrand.utils.k5) t1Var).a()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f280435c.a(lVar);
        lVar.getAppId();
        jSONObject.toString();
        try {
            java.lang.String string = jSONObject.getString("tech");
            kotlin.jvm.internal.o.d(string);
            this.f270482g.invoke(a17, string, new gd1.a(lVar, i17, this));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "parse tech failed");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
        }
    }
}
