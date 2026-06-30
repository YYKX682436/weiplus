package uc1;

/* loaded from: classes13.dex */
public class y1 extends uc1.b {
    public static final int CTRL_INDEX = 860;
    public static final java.lang.String NAME = "setMapIndoorMaskColor";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapIndoorMaskColor", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapIndoorMaskColor", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapIndoorMaskColor", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("maskColor", "#000000");
        int parseColor = android.graphics.Color.parseColor("#000000");
        try {
            parseColor = ik1.w.l(optString);
        } catch (java.lang.Exception unused) {
        }
        ((vc1.p1) E).f435068e.getMap().setIndoorMaskColor(parseColor);
        lVar.a(i17, o("ok"));
    }
}
