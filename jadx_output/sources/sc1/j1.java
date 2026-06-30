package sc1;

/* loaded from: classes7.dex */
public class j1 extends gb1.h {
    private static final int CTRL_INDEX = 361;
    public static final java.lang.String NAME = "updateLivePusher";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00b1 -> B:32:0x00bc). Please report as a decompilation issue!!! */
    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (!(view2 instanceof com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = (com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView) view2;
        if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            appBrandLivePusherView.f81569h = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, appBrandLivePusherView.f81569h);
            jSONObject.optString("filterImageMd5", null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandLivePusherView.f81569h)) {
                try {
                    jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateLivePusher", "parseFilterImage, ignore exception:%s", e17);
                }
            } else if (appBrandLivePusherView.f81569h.startsWith("http://") || appBrandLivePusherView.f81569h.startsWith("https://")) {
                jSONObject.remove(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
        appBrandLivePusherView.g(sc1.n1.b(jSONObject));
        java.lang.Object obj = com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE;
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE)) {
                java.lang.String string = jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE);
                java.lang.String optString = jSONObject.optString("backgroundMD5");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, url is null");
                } else {
                    com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, string, optString, new sc1.g1(this, appBrandLivePusherView, string));
                }
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", obj, e18.getLocalizedMessage());
        }
        try {
            obj = jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            if (obj != 0) {
                java.lang.String string2 = jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, url is null");
                } else {
                    com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, string2, null, new sc1.h1(this, appBrandLivePusherView, string2));
                }
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE)) {
                java.lang.String string3 = jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE);
                java.lang.String optString2 = jSONObject.optString("watermarkMD5");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, url is null");
                } else {
                    com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, string3, optString2, new sc1.i1(this, appBrandLivePusherView));
                }
            }
            return true;
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, e27.getLocalizedMessage());
            return true;
        }
    }
}
