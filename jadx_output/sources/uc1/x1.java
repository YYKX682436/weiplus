package uc1;

/* loaded from: classes13.dex */
public class x1 extends uc1.b {
    public static final int CTRL_INDEX = 526;
    public static final java.lang.String NAME = "setMapIndoorFloor";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapIndoorFloor", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapIndoorFloor", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapIndoorFloor", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            ((vc1.p1) E).f435068e.getMap().setIndoorFloor(jSONObject.optString("buildingId"), jSONObject.optString("floorName"));
            C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
