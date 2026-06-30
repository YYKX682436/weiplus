package v31;

/* loaded from: classes7.dex */
public final class j extends gb1.f {
    public static final int CTRL_INDEX = 1400;
    public static final java.lang.String NAME = "removeMiniProgramPlayableViewNew";

    @Override // gb1.f, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "invoke");
        B(lVar, jSONObject, i17, lVar.getF147808e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "getViewId: " + i17);
        return i17;
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "onRemoveView");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew mbJsEventOnPlayableCustomEventNew = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "removePlayableView");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(mbJsEventOnPlayableCustomEventNew.f147881d, gVar2);
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Ni();
        return true;
    }
}
