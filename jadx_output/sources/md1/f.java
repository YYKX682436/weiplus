package md1;

/* loaded from: classes7.dex */
public class f extends gb1.d {
    private static final int CTRL_INDEX = 623;
    public static final java.lang.String NAME = "insertVoIPView";

    public f() {
        si1.e.a(NAME);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflateView," + jSONObject.toString());
        android.content.Context context = tVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, context is null, %s", k());
            return null;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        if (p0Var.f96032u == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s, audio room", k());
            return null;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        java.lang.Object c17 = p0Var.f96019h.c(context, jSONObject, false);
        if (c17 != null) {
            return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, (android.view.View) c17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s", k());
        return null;
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d dVar = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView failed, view is null, viewId:" + i17);
            return;
        }
        dVar.setFullScreenDelegate(new md1.e(this, tVar, jSONObject.optBoolean("independent", false), i17, new md1.d(this)));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView, viewId:[" + i17 + "," + dVar.getViewId() + "],data:" + jSONObject.toString());
        dVar.k(jSONObject);
    }
}
