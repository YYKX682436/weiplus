package pc1;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 222;
    private static final java.lang.String NAME = "stopBeaconDiscovery";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopBeaconDiscovery", "stopBeaconDiscovery!");
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f353348a).get(lVar.getAppId());
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopBeaconDiscovery", "beaconWorker is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 11004);
            lVar.a(i17, p("fail:not start", hashMap));
            return;
        }
        if (dVar.a()) {
            pc1.e.a(lVar.getAppId());
            new java.util.HashMap().put("errCode", 0);
            lVar.a(i17, o("ok"));
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 11004);
            lVar.a(i17, p("fail:not start", hashMap2));
        }
        pc1.m mVar = new pc1.m(null);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("available", pc1.e.f353350c);
            jSONObject2.put("discovering", false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopBeaconDiscovery", "put JSON data error : %s", e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopBeaconDiscovery", "OnBeaconServiceChangedEvent %s", jSONObject2.toString());
        int componentId = lVar.getComponentId();
        mVar.p(lVar);
        mVar.f82376h = componentId;
        mVar.f82374f = jSONObject2.toString();
        mVar.m();
    }
}
