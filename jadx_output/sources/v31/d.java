package v31;

/* loaded from: classes7.dex */
public final class d extends gb1.d {
    public static final int CTRL_INDEX = 1398;
    public static final java.lang.String NAME = "insertMiniProgramPlayableViewNew";

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "invoke");
        ((com.tencent.mm.plugin.appbrand.y) component).getRuntime().N.a(v31.b.f433086d);
        B(component, data, i17, component.getF147808e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t component, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "inflateView");
        android.content.Context f147807d = component.getF147807d();
        android.content.Context f147807d2 = component.getF147807d();
        kotlin.jvm.internal.o.f(f147807d2, "getContext(...)");
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(f147807d, new com.tencent.mm.adplayable.jsapi.MagicPlayableContainer(f147807d2, null, 0, 6, null));
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t component, int i17, android.view.View view, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView viewId:" + i17);
        com.tencent.mm.adplayable.jsapi.MagicPlayableContainer magicPlayableContainer = (com.tencent.mm.adplayable.jsapi.MagicPlayableContainer) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.adplayable.jsapi.MagicPlayableContainer.class);
        if (magicPlayableContainer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView playableContainerView fail");
            x31.b[] bVarArr = x31.b.f451599d;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", 2);
            hashMap.put("status", "");
            hashMap.put("extra", "");
            java.lang.String gVar = new cl0.g(hashMap).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            com.tencent.mm.plugin.appbrand.e9 v37 = ((com.tencent.mm.plugin.appbrand.page.v5) component).v3();
            w31.a aVar = new w31.a();
            aVar.f82374f = gVar;
            v37.p(aVar);
            return;
        }
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Di(magicPlayableContainer, new v31.c(component));
        boolean optBoolean = data.optBoolean("mute");
        java.lang.String optString = data.optString("extra");
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Bi(optBoolean);
        a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "setManualPauseStatus");
        y31.f fVar = kVar.f1189d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "setManualPauseStatus");
            fVar.f459167h = true;
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew mbJsEventOnPlayableCustomEventNew = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew();
        kotlin.jvm.internal.o.d(optString);
        cl0.g gVar2 = new cl0.g();
        gVar2.h("eventName", "injectJsFiles");
        gVar2.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optString);
        java.lang.String gVar3 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
        ((a41.k) iVar).Ai(mbJsEventOnPlayableCustomEventNew.f147881d, gVar3);
    }
}
