package uc1;

/* loaded from: classes13.dex */
public class g2 extends uc1.b {
    public static final int CTRL_INDEX = 133;
    public static final java.lang.String NAME = "updateMapMarkers";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject2;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiUpdateMapMarkers", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("markers")) {
            try {
                jSONArray = new org.json.JSONArray(jSONObject.optString("markers"));
            } catch (org.json.JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiUpdateMapMarkers", "markersArray is null, return");
                lVar.a(i17, o("fail:internal error"));
                return;
            }
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Map.JsApiUpdateMapMarkers", e17, "", new java.lang.Object[0]);
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    ik1.h0.b(new vc1.c0((vc1.p1) E, jSONObject2.optString(dm.i4.COL_ID), D(lVar, jSONObject, jSONObject2), (o91.d) lVar.q(o91.d.class)));
                }
            }
        }
        C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
    }
}
