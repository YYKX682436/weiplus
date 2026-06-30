package td1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 853;
    public static final java.lang.String NAME = "getRecentUsageList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRecentUsageList", "data=" + jSONObject);
        int optInt = jSONObject.optInt("count", Integer.MAX_VALUE);
        if (optInt < 0) {
            lVar.a(i17, o("fail:illegal count"));
            return;
        }
        int optInt2 = jSONObject.optInt("requestId", Integer.MAX_VALUE);
        if (optInt2 == Integer.MAX_VALUE) {
            lVar.a(i17, o("fail:illegal requestId"));
            return;
        }
        long optLong = jSONObject.optLong("lastUpdateTime", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        if (optLong < 0) {
            lVar.a(i17, o("fail:illegal lastUpdateTime"));
        } else {
            lVar.a(i17, o("ok"));
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter(optInt, optLong, optInt2), td1.f.class, new td1.g(lVar, optInt2));
        }
    }
}
