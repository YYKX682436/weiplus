package v31;

/* loaded from: classes7.dex */
public final class k extends gb1.h {
    public static final int CTRL_INDEX = 1399;
    public static final java.lang.String NAME = "updateMiniProgramPlayableViewNew";

    @Override // gb1.h, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "invoke");
        if (data.has("resume") && data.optBoolean("resume", true)) {
            a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
            kVar.getClass();
            com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "manualResume");
            y31.f fVar = kVar.f1189d;
            if (fVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "manualResume manualPause:" + fVar.f459167h);
                if (fVar.f459167h) {
                    jc3.j0 j0Var = fVar.f459163d;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).A();
                    }
                    fVar.f459167h = false;
                }
            }
        }
        if (data.has("mute")) {
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Bi(data.optBoolean("mute"));
        }
        if (data.has("extra")) {
            java.lang.String optString = data.optString("extra");
            a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
            com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew mbJsEventOnPlayableCustomEventNew = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew();
            kotlin.jvm.internal.o.d(optString);
            cl0.g gVar = new cl0.g();
            gVar.h("eventName", "updateStatus");
            gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            ((a41.k) iVar).Ai(mbJsEventOnPlayableCustomEventNew.f147881d, gVar2);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        B(component, data, i17, component.getF147808e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "viewId:" + i17);
        return i17;
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "onUpdateView");
        return true;
    }
}
