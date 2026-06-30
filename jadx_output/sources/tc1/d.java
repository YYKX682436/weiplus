package tc1;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 423;
    private static final java.lang.String NAME = "sendRedPacket";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", -1);
            c0Var.a(i17, p("fail:system error {{data is null}}", hashMap));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            new tc1.c(this, c0Var, c0Var.W0(com.tencent.mm.plugin.appbrand.page.n7.class), jSONObject, i17).d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "scope is nil");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", -1);
        c0Var.a(i17, p("fail:system error {{scope is nil}}", hashMap2));
    }
}
