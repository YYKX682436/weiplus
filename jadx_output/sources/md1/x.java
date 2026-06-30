package md1;

/* loaded from: classes7.dex */
public class x extends gb1.h {
    private static final int CTRL_INDEX = 624;
    public static final java.lang.String NAME = "updateVoIPView";

    public x() {
        si1.e.a(NAME);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "onUpdateView," + jSONObject.toString());
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "the camera view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "onUpdateView,viewId:[" + i17 + "," + jSONObject.optInt("viewId") + "],data:" + jSONObject.toString());
        ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) callback).i(jSONObject);
        return true;
    }
}
