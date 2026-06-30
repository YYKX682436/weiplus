package na1;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 688;
    public static final java.lang.String NAME = "reportCanvasData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCanvasData", "hy: request report canvas data");
        java.lang.String optString = jSONObject.optString("eventInfo");
        int optInt = jSONObject.optInt("viewId", 0);
        if (c0Var.V0() == null || c0Var.V0().B1(pa1.a.class) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReportCanvasData", "hy: current is not game");
            return;
        }
        pa1.e eVar = ((pa1.t) ((pa1.a) c0Var.V0().B1(pa1.a.class))).f352967x;
        if (eVar != null) {
            eVar.f352958c.postToWorker(new pa1.c(eVar, optInt, optString));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportCanvasData", "hy: guard is null!");
        }
    }
}
