package pc1;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 223;
    private static final java.lang.String NAME = "getBeacons";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f353348a).get(lVar.getAppId());
        if (dVar != null) {
            java.util.Map map = dVar.f353341b;
            java.util.Objects.toString(map);
            if (map != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                if (concurrentHashMap.size() > 0) {
                    java.util.Iterator it = concurrentHashMap.values().iterator();
                    while (it.hasNext()) {
                        jSONArray.put((org.json.JSONObject) it.next());
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBeacons", "not found device");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("beacons", jSONArray);
        lVar.a(i17, p("ok", hashMap));
    }
}
