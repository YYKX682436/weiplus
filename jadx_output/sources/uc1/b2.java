package uc1;

/* loaded from: classes13.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f426296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f426297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc1.d2 f426299g;

    public b2(uc1.d2 d2Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f426299g = d2Var;
        this.f426296d = lVar;
        this.f426297e = jSONObject;
        this.f426298f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        uc1.d2 d2Var = this.f426299g;
        d2Var.f426308h.set(true);
        int i17 = 0;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f426296d;
        org.json.JSONObject jSONObject = this.f426297e;
        int i18 = this.f426298f;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiTranslateMapMarker", "data is invalid, err");
            d2Var.G(lVar, i18, "fail:invalid data", false);
            return;
        }
        jSONObject.toString();
        vc1.a3 E = d2Var.E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiTranslateMapMarker", "mapView is null, return");
            d2Var.G(lVar, i18, java.lang.String.format("fail:internal error %s", "mapview is null"), false);
            return;
        }
        java.lang.String optString = jSONObject.optString("markerId");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("keyFrames"));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            jSONArray.length();
            int i19 = 0;
            while (i19 < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i19);
                vc1.x1 x1Var = new vc1.x1();
                int optInt = jSONObject2.optInt("duration", i17);
                x1Var.f435211f = optInt;
                if (optInt == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiTranslateMapMarker", "keyFrame.duration is zero, err continue");
                } else {
                    x1Var.f435210e = (float) jSONObject2.optDouble(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
                    java.lang.String optString2 = jSONObject2.optString("latitude");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        x1Var.f435209d = com.tencent.mm.sdk.platformtools.t8.F(optString2, 0.0d);
                    }
                    java.lang.String optString3 = jSONObject2.optString("longitude");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                        x1Var.f435208c = com.tencent.mm.sdk.platformtools.t8.F(optString3, 0.0d);
                    }
                    linkedList.add(x1Var);
                }
                i19++;
                i17 = 0;
            }
            ((vc1.p1) E).f0(optString, linkedList, new uc1.c2(d2Var, lVar, i18, E));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", e17);
            d2Var.G(lVar, i18, java.lang.String.format("fail:internal error %s", "parse json fail"), ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
