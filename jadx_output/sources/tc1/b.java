package tc1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 424;
    private static final java.lang.String NAME = "openRedPacket";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", -1);
            e9Var.a(i17, p("fail:system error {{data is null}}", hashMap));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("redPacketId", null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "redPacketId is nil");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", -1);
            e9Var.a(i17, p("fail:system error {{redPacketId is nil}}", hashMap2));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            ce.g gVar = (ce.g) V0.B1(ce.g.class);
            if (gVar != null) {
                ((ce.o) gVar).V(true, true, null);
            }
            new tc1.a(this, e9Var, V0, jSONObject, i17).d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "associated page view is null!!");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", -1);
        e9Var.a(i17, p("fail:system error {{associated page view is null}}", hashMap3));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
