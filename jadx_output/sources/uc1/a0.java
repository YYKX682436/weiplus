package uc1;

/* loaded from: classes13.dex */
public class a0 extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getMapSkew";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapSkew", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapSkew", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapSkew", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("skew", java.lang.Float.valueOf(((vc1.p1) E).f435068e.getMap().getCameraPosition().getSkew()));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapSkew", "getMapSkew ok, values:%s", hashMap.toString());
            C(lVar, i17, p("ok", hashMap), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
