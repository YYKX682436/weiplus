package sc1;

/* loaded from: classes7.dex */
public class f1 extends gb1.h {
    private static final int CTRL_INDEX = 365;
    public static final java.lang.String NAME = "updateLivePlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (!(view2 instanceof sc1.f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        sc1.f fVar = (sc1.f) view2;
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        fVar.f405664i = a17.getBoolean("needEvent", fVar.f405664i);
        sc1.k1 f17 = ((sc1.o1) fVar.f405660e).f(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", java.lang.Integer.valueOf(f17.f405688a), f17.f405689b);
        return true;
    }
}
