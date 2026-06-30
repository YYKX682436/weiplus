package qf1;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 315;
    public static final java.lang.String NAME = "stopWifi";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopWifi", "invoke registerHotspotHelper");
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopWifi", "mContext is null, invoke fail!");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 4);
            lVar.a(i17, t("fail:context is null", hashMap));
            return;
        }
        if (!qf1.m.f362278g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopWifi", "not invoke startWifi");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 12000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1505001);
            lVar.a(i17, t("fail:not invoke startWifi", hashMap2));
            return;
        }
        rf1.d.b(context);
        qf1.m.f362278g = false;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 0);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap3.put("errno", 0);
        lVar.a(i17, t("ok", hashMap3));
    }
}
