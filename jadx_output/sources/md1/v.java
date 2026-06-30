package md1;

/* loaded from: classes7.dex */
public class v extends gb1.f {
    private static final int CTRL_INDEX = 625;
    public static final java.lang.String NAME = "removeVoIPView";

    public v() {
        si1.e.a(NAME);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("viewId", 0);
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "onRemoveView," + jSONObject.toString());
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "the view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96019h.a((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) callback);
        return true;
    }
}
