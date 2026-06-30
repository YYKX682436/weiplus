package yc1;

/* loaded from: classes7.dex */
public final class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1442;
    public static final java.lang.String NAME = "preFetchDNS";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        rk0.c.c("MicroMsg.JsApiPreFetchDNS", "start preFetchDNS", new java.lang.Object[0]);
        if (c0Var == null || jSONObject == null || (jSONArray = jSONObject.getJSONArray("domainList")) == null) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new yc1.b0(c0Var, i17, this, jSONArray, null), 2, null);
    }
}
