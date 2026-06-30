package uc1;

/* loaded from: classes13.dex */
public class w extends uc1.b {
    public static final int CTRL_INDEX = 525;
    public static final java.lang.String NAME = "getMapIndoorFloor";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        vc1.v1 v1Var = p1Var.N;
        if (v1Var == null) {
            v1Var = new vc1.v1();
            v1Var.f435186a = "";
            v1Var.f435187b = "";
            v1Var.f435188c = new java.util.LinkedList();
            v1Var.f435189d = -1;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("buildingId", v1Var.f435186a);
            hashMap.put("buildingName", v1Var.f435187b);
            java.util.List list = v1Var.f435188c;
            if (list != null && ((java.util.LinkedList) list).size() > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (vc1.w1 w1Var : v1Var.f435188c) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, w1Var.f435192a);
                    jSONArray.put(jSONObject2);
                }
                hashMap.put("floorList", jSONArray);
            }
            hashMap.put("floorIndex", java.lang.Integer.valueOf(v1Var.f435189d));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapActiveIndoorInfo", "put JSON data error : %s", e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapActiveIndoorInfo", "getMapActiveIndoorInfo ok, values:%s", hashMap.toString());
        C(lVar, i17, p("ok", hashMap), true, p1Var instanceof dg1.h);
    }
}
