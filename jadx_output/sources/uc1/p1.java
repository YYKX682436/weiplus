package uc1;

/* loaded from: classes13.dex */
public class p1 extends gb1.f {
    public static final int CTRL_INDEX = 3;
    public static final java.lang.String NAME = "removeMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return vc1.e3.c(jSONObject);
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMap", "data is null");
            return false;
        }
        vc1.d3.a(6);
        if (vc1.h3.a(tVar.getAppId(), vc1.e3.b(tVar, jSONObject))) {
            vc1.d3.a(7);
            return true;
        }
        vc1.d3.a(8);
        return true;
    }
}
