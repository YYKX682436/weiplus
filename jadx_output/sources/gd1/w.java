package gd1;

/* loaded from: classes7.dex */
public final class w extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 792;
    public static final java.lang.String NAME = "NFCTransceive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiNFCTransceive", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiNFCTransceive", "invoke, data is null");
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
            try {
                java.lang.Object obj = jSONObject.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.nio.ByteBuffer");
                byte[] a18 = ik1.f.a((java.nio.ByteBuffer) obj);
                kotlin.jvm.internal.o.d(a18);
                kotlin.jvm.internal.o.d(string);
                gd1.v vVar = new gd1.v(lVar, i17, this);
                kotlin.jvm.internal.o.f(java.util.Arrays.toString(a18), "toString(...)");
                ((ku5.t0) ku5.t0.f312615d).h(new hd1.u(a17, vVar, string, a18), "NFC-IO");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiNFCTransceive", "parse data failed since " + e17);
                lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiNFCTransceive", "parse tech failed");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
        }
    }
}
