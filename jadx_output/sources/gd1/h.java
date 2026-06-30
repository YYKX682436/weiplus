package gd1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 821;
    public static final java.lang.String NAME = "isNFCTechConnected";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiIsNFCTechConnected", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiIsNFCTechConnected", "invoke, data is null");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.t1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.t1.class);
        if (t1Var != null && !((com.tencent.mm.plugin.appbrand.utils.k5) t1Var).a()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f280435c.a(lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiIsNFCTechConnected", "invoke, appId: " + lVar.getAppId() + ", data: " + jSONObject);
        try {
            java.lang.String string = jSONObject.getString("tech");
            kotlin.jvm.internal.o.d(string);
            ((ku5.t0) ku5.t0.f312615d).h(new hd1.q(a17, new gd1.g(lVar, i17, this), string), "NFC-IO");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiIsNFCTechConnected", "parse tech failed");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
        }
    }
}
