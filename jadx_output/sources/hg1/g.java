package hg1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 819;
    public static final java.lang.String NAME = "operateXWebVideoBackground";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = new com.tencent.mm.plugin.appbrand.extendplugin.b(i17, jSONObject, lVar, this);
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "audioOfVideoBackgroundPlayManager is null");
            lVar.a(i17, o("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        tf.q g17 = a17.g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is null. data:%s", jSONObject.toString());
            lVar.a(i17, o("fail:videoPlayer is null"));
        } else if (g17 instanceof bg.f) {
            ((bg.f) g17).f(bVar);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is not VideoPluginHandler");
            lVar.a(i17, o("fail:videoPlayer is not for XwebVideo"));
        }
    }
}
