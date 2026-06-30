package uc1;

/* loaded from: classes13.dex */
public class h extends uc1.b {
    public static final int CTRL_INDEX = 785;
    public static final java.lang.String NAME = "addMapCustomLayer";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapCustomLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapCustomLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapCustomLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.m(jSONObject.optString("layerId", ""));
            C(lVar, i17, o("ok"), true, p1Var instanceof dg1.h);
        }
    }
}
