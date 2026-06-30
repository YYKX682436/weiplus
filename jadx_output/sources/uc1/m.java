package uc1;

/* loaded from: classes13.dex */
public class m extends uc1.b {
    public static final int CTRL_INDEX = 133;
    public static final java.lang.String NAME = "addMapMarkers";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject2;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiAddMapMarkers", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiAddMapMarkers", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        boolean z17 = true;
        boolean optBoolean = jSONObject.optBoolean("clear", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "clear:%b", java.lang.Boolean.valueOf(optBoolean));
        if (optBoolean) {
            ((vc1.p1) E).M();
        }
        if (jSONObject.has("markers")) {
            try {
                jSONArray = new org.json.JSONArray(jSONObject.optString("markers"));
            } catch (org.json.JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Map.JsApiAddMapMarkers", "markersArray is null, return");
                lVar.a(i17, o("fail:internal error"));
                return;
            }
            int i18 = 0;
            while (i18 < jSONArray.length()) {
                try {
                    jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Map.JsApiAddMapMarkers", e17, "", new java.lang.Object[0]);
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    vc1.q2 D = D(lVar, jSONObject, jSONObject2);
                    java.lang.String optString = jSONObject2.optString(dm.i4.COL_ID);
                    vc1.p2 p2Var = D.f435149t;
                    if (p2Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "id:%s, label:%s, joinCluster:%b, clusterId:%d", optString, p2Var.f435112a, java.lang.Boolean.valueOf(D.f435130a), java.lang.Integer.valueOf(D.f435131b));
                    }
                    if (D.f435130a) {
                        vc1.p1 p1Var = (vc1.p1) E;
                        if (!((p1Var.f435096s == null || p1Var.f435098t == null) ? false : z17) && !p1Var.f435100u) {
                            p1Var.C(true, true, 2, 60, new uc1.l(this, jSONObject, lVar));
                        }
                    }
                    o91.d dVar = (o91.d) lVar.q(o91.d.class);
                    vc1.p1 p1Var2 = (vc1.p1) E;
                    if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                        p1Var2.c(optString, D, dVar);
                    } else {
                        com.tencent.mm.sdk.platformtools.u3.h(new vc1.p(p1Var2, optString, D, dVar));
                    }
                }
                i18++;
                z17 = true;
            }
        }
        C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
    }
}
