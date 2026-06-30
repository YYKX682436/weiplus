package sc1;

/* loaded from: classes7.dex */
public class e1 extends gb1.f {
    private static final int CTRL_INDEX = 362;
    public static final java.lang.String NAME = "removeLivePusher";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveLivePusher", "onRemoveView livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRemoveLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (view2 instanceof com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView) {
            ((com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView) view2).e();
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveLivePusher", "targetView not AppBrandLivePusherView");
        return false;
    }
}
