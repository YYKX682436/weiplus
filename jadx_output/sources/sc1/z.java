package sc1;

/* loaded from: classes7.dex */
public class z extends gb1.d {
    private static final int CTRL_INDEX = 364;
    public static final java.lang.String NAME = "insertLivePlayer";

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        sc1.m1.a();
        if (lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class) == null || !((com.tencent.mm.plugin.appbrand.wxassistant.q2) lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)).g4()) {
            B(lVar, jSONObject, i17, lVar.getJsRuntime());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePlayer", "wx assistant is enabled, return");
        java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("livePlayerId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer = new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(tVar.getContext(), new sc1.f(tVar, tVar.getContext()));
        coverViewContainer.setBackgroundColor(-16777216);
        return coverViewContainer;
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        android.content.Context context;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePlayer", "onInsertView livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.rtmp.TXLiveBase.setAppVersion(java.lang.String.format("weixin_%s", tVar.getAppId()));
        sc1.f fVar = (sc1.f) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(sc1.f.class);
        sc1.m mVar = new sc1.m(this, fVar);
        sc1.n nVar = new sc1.n(this, fVar);
        sc1.o oVar = new sc1.o(this, tVar, fVar);
        sc1.p pVar = new sc1.p(this, fVar, tVar);
        tVar.U(nVar);
        tVar.R(oVar);
        tVar.w(pVar);
        fVar.setFullScreenDelegate(new sc1.q(this, tVar, jSONObject.optBoolean("independent", false), i17, mVar));
        fVar.setExitListener(new sc1.r(this, tVar, oVar, nVar));
        fVar.setNeedEvent(jSONObject.optBoolean("needEvent", false));
        fVar.setOnFullScreenChangeListener(new sc1.s(this, i17, tVar));
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        sc1.k1 k17 = ((sc1.o1) fVar.f405660e).k(fVar, a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onInsert code:%d info:%s", java.lang.Integer.valueOf(k17.f405688a), k17.f405689b);
        fVar.setPlayEventListener(new sc1.t(this, i17, tVar));
        fVar.setAudioVolumeEventListener(new sc1.u(this, i17, tVar));
        if (a17.getInt("mode", 0) == 5) {
            context = view.getContext();
            i18 = com.tencent.mm.R.string.f490020io;
        } else {
            context = view.getContext();
            i18 = com.tencent.mm.R.string.f490019in;
        }
        fVar.setContentDescription(context.getString(i18));
    }
}
