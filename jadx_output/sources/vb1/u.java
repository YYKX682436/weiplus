package vb1;

/* loaded from: classes7.dex */
public final class u extends gb1.d {
    public static final int CTRL_INDEX = 594;
    public static final java.lang.String NAME = "insertWebGLCanvas";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f434501g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f434502h;

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.d
    public boolean I() {
        return this.f434502h;
    }

    @Override // gb1.d
    public boolean J() {
        return this.f434502h;
    }

    @Override // gb1.d
    public android.view.View L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.page.n7 component = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("JsApiInsertHTMLCanvasElement", "inflateView of HTMLCanvasElement for canvasId [" + i17 + "] [" + data + ']');
        com.tencent.mm.plugin.appbrand.service.c0 U1 = component.U1();
        ae.r rVar = U1 != null ? (ae.r) U1.z1(ae.r.class) : null;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return null;
        }
        com.tencent.magicbrush.MagicBrush w17 = rVar.w();
        if (w17 == null) {
            return null;
        }
        this.f434502h = data.optBoolean("scrollSupportedTouchEvent", false);
        vb1.q qVar = new vb1.q(this, i17);
        this.f434501g.put(java.lang.Integer.valueOf(i17), qVar);
        android.content.Context f147807d = component.getF147807d();
        kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = new com.tencent.magicbrush.ui.MagicBrushView(f147807d, gh.y.TextureView);
        magicBrushView.setMagicBrush(w17);
        magicBrushView.getPreparedListeners().a(new vb1.r(qVar));
        if (data.optBoolean("transparentBackground", false)) {
            magicBrushView.setOpaque(false);
        }
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(appId).a(i17, magicBrushView);
        if (this.f434502h) {
            magicBrushView.setEnableTouchEvent(false);
        }
        component.U(new vb1.s(component, i17, w17));
        if (component.l2()) {
            java.lang.String appId2 = component.getAppId();
            kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
            vb1.d a17 = bVar.a(appId2);
            a17.c(i17);
            if (a17.d() == 1) {
                w17.f();
            }
        }
        component.R(new vb1.t(component, i17, w17));
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(component.getF147807d(), magicBrushView);
    }

    @Override // gb1.d
    public void O(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject data, gb1.n callback) {
        com.tencent.mm.plugin.appbrand.page.n7 component = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = this.f434501g.get(java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(obj);
        vb1.q qVar = (vb1.q) obj;
        qVar.f434492c = callback;
        if (qVar.f434491b) {
            qVar.a();
        }
    }
}
