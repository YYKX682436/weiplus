package uc1;

/* loaded from: classes13.dex */
public class z1 extends uc1.b {
    public static final int CTRL_INDEX = 993;
    public static final java.lang.String NAME = "setMapLocMarkerIcon";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapLocMarkerIcon", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("iconPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath:%s", optString);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath is null, return");
            lVar.a(i17, o("fail:iconPath is null"));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && lVar.q(o91.e.class) != null) {
            ((vc1.p1) E).V(((o91.e) lVar.q(o91.e.class)).T0(lVar, optString), (o91.d) lVar.q(o91.d.class));
        }
        lVar.a(i17, o("ok"));
    }
}
