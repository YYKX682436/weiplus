package tj;

/* loaded from: classes7.dex */
public final class g extends gb1.h {
    public static final int CTRL_INDEX = 1195;
    public static final java.lang.String NAME = "updateMiniProgramPlayableView";

    @Override // gb1.h, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "invoke");
        if (data.has("resume") && data.optBoolean("resume", true)) {
            com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "manualResume");
            uj.p pVar = uj.f.f428153b;
            if (pVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "manualResume");
                if (pVar.f428173h) {
                    jc3.j0 j0Var = pVar.f428169d;
                    if (j0Var == null) {
                        kotlin.jvm.internal.o.o("magicBrush");
                        throw null;
                    }
                    ((rc3.w0) j0Var).A();
                    pVar.f428173h = false;
                }
            }
        }
        if (data.has("mute")) {
            boolean optBoolean = data.optBoolean("mute");
            com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "muteAudio mute:" + optBoolean);
            uj.p pVar2 = uj.f.f428153b;
            if (pVar2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "muteAudio mute:" + optBoolean);
                jc3.j0 j0Var2 = pVar2.f428169d;
                if (j0Var2 == null) {
                    kotlin.jvm.internal.o.o("magicBrush");
                    throw null;
                }
                rc3.w0 w0Var = (rc3.w0) j0Var2;
                w0Var.M(new rc3.s0(w0Var, optBoolean));
            }
        }
        if (data.has("customEvent")) {
            java.lang.String optString = data.optString("customEvent");
            kotlin.jvm.internal.o.d(optString);
            com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "sendCustomEvent:".concat(optString));
            uj.p pVar3 = uj.f.f428153b;
            if (pVar3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "sendCustomEvent event:".concat(optString));
                cl0.g gVar = new cl0.g();
                gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                jc3.j0 j0Var3 = pVar3.f428169d;
                if (j0Var3 == null) {
                    kotlin.jvm.internal.o.o("magicBrush");
                    throw null;
                }
                ((rc3.w0) j0Var3).k(new com.tencent.mm.adplayable.jsapi.OnPlayableCustomEvent().f147881d, gVar2);
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        B(component, data, i17, component.getF147808e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "viewId:" + i17);
        return i17;
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "onUpdateView");
        return true;
    }
}
