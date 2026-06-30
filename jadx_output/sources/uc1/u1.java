package uc1;

/* loaded from: classes13.dex */
public class u1 extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "removeMapVisualLayer";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "layerId is empty");
            lVar.a(i17, o("fail:invalid data"));
        } else if (((vc1.p1) E).R(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer ok");
            lVar.a(i17, o("ok"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer fail");
            lVar.a(i17, o("fail"));
        }
    }
}
