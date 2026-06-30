package uc1;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(vc1.a3 a3Var, org.json.JSONObject jSONObject) {
        com.tencent.mapsdk.raster.model.LatLng mapCenter = ((vc1.p1) a3Var).f435068e.getMap().getMapCenter();
        double latitude = mapCenter.getLatitude();
        double longitude = mapCenter.getLongitude();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("latitude", latitude);
            jSONObject2.put("longitude", longitude);
            jSONObject.remove("centerLocation");
            jSONObject.put("centerLocation", jSONObject2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandMapUtils", e17, "", new java.lang.Object[0]);
        }
    }

    public static void b(vc1.a3 a3Var, org.json.JSONObject jSONObject) {
        vc1.z2 z2Var = ((vc1.p1) a3Var).A().f435225a;
        if (z2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMapUtils", "visibleRegion is  null");
        }
        vc1.z1 z1Var = z2Var.f435232a;
        if (z1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMapUtils", "latLngBounds is  null");
        }
        vc1.y1 y1Var = z1Var.f435230a;
        vc1.y1 y1Var2 = z1Var.f435231b;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (y1Var != null) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("latitude", y1Var.f435223a);
                jSONObject3.put("longitude", y1Var.f435224b);
                jSONObject2.put("southwest", jSONObject3);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandMapUtils", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (y1Var2 != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("latitude", y1Var2.f435223a);
            jSONObject4.put("longitude", y1Var2.f435224b);
            jSONObject2.put("northeast", jSONObject4);
        }
        jSONObject.remove("region");
        jSONObject.put("region", jSONObject2);
    }
}
