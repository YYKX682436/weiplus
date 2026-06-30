package fc1;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 867;
    public static final java.lang.String NAME = "getDeviceInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        uh1.a aVar;
        java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("waidPkg");
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            str = me4.c.d(optString);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            kotlin.jvm.internal.o.f(str, "getAppWaid(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetDeviceInfo", "waidPkg=" + optString);
        } else {
            str = "";
        }
        java.lang.String Ai = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai();
        java.lang.String str2 = (lVar == null || (aVar = (uh1.a) lVar.b(uh1.a.class)) == null) ? null : aVar.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetDeviceInfo", "getDeviceInfo, oaid:" + k96 + ", imei:, waid:" + str, "ua:" + str2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 20);
        java.util.Map k17 = kz5.c1.k(new jz5.l("oaid", k96), new jz5.l("imei", ""), new jz5.l("waid", str), new jz5.l("devIdInfo", Ai), new jz5.l("ua", str2));
        if (lVar != null) {
            lVar.a(i17, p("ok", k17));
        }
    }
}
