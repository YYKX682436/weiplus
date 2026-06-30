package vd1;

/* loaded from: classes.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "kvReport";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiKvReport", NAME);
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        int optInt = jSONObject.optInt("logId");
        java.lang.String optString = jSONObject.optString("logStr");
        if (optInt <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.a(i17, o("fail:logId error or logStr null"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiKvReport", "%s %s", java.lang.Integer.valueOf(optInt), optString);
        jx3.f.INSTANCE.kvStat(optInt, optString);
        lVar.a(i17, o("ok"));
    }
}
