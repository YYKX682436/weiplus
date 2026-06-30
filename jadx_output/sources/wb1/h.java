package wb1;

/* loaded from: classes7.dex */
public final class h extends eg.a implements gh.r {

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f444375g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f444376h;

    /* renamed from: i, reason: collision with root package name */
    public int f444377i;

    /* renamed from: n, reason: collision with root package name */
    public gh.t f444379n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f444380o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.magicbrush.ui.MagicBrushView f444381p;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f444384s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f444378m = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public int f444382q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f444383r = -1;

    public static final void r(wb1.h hVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17) {
        hVar.getClass();
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
            hVar.f444382q = java.lang.Math.max((int) ik1.w.h(optJSONObject, "width", 0.0f), 1);
            hVar.f444383r = java.lang.Math.max((int) ik1.w.h(optJSONObject, "height", 0.0f), 1);
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
            v5Var.w(new wb1.b(hVar));
            hVar.f444376h = v5Var;
            com.tencent.mm.plugin.appbrand.e9 v37 = v5Var.v3();
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = v37 instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.luggage.sdk.jsapi.component.service.y) v37 : null;
            ae.r rVar = yVar != null ? (ae.r) yVar.z1(ae.r.class) : null;
            if (rVar == null) {
                com.tencent.mars.xlog.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
                return;
            }
            com.tencent.magicbrush.MagicBrush w17 = rVar.w();
            if (w17 == null) {
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("scrollSupportedTouchEvent", false);
            hVar.f444377i = jSONObject.optInt("canvasId", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "insert xweb webgl canvas viewId:" + hVar.f444377i + " scrollSupportedTouchEvent:" + optBoolean);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.magicbrush.ui.MagicBrushView magicBrushView = new com.tencent.magicbrush.ui.MagicBrushView(context, hVar);
            magicBrushView.setMagicBrush(w17);
            magicBrushView.getPreparedListeners().a(new wb1.d(hVar, w17, lVar, i17, k0Var));
            vb1.b bVar = vb1.d.f434473c;
            java.lang.String appId = v5Var.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            bVar.a(appId).a(hVar.f444377i, magicBrushView);
            if (optBoolean) {
                magicBrushView.setEnableTouchEvent(false);
            }
            hVar.f444381p = magicBrushView;
            v5Var.U(new wb1.e(lVar, hVar, w17));
            if (v5Var.l2()) {
                java.lang.String appId2 = v5Var.getAppId();
                kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
                vb1.d a17 = bVar.a(appId2);
                a17.c(hVar.f444377i);
                if (a17.d() == 1) {
                    w17.f();
                }
            }
            v5Var.R(new wb1.f(lVar, hVar, w17));
            hVar.v();
            if (hVar.f444384s) {
                w17.f48583g.k(new wb1.g(lVar, i17, k0Var), false);
            }
        }
    }

    public static final void s(wb1.h hVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = hVar.f444376h;
        if (v5Var != null) {
            vb1.b bVar = vb1.d.f434473c;
            java.lang.String appId = v5Var.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            bVar.a(appId).f434476b.remove(java.lang.Integer.valueOf(hVar.f444377i));
            lVar.a(i17, k0Var.o("ok"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "componentView is nul, return");
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, k0Var.u(str, jSONObject2));
    }

    public static final void t(wb1.h hVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17) {
        gh.t tVar;
        hVar.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        if (optJSONObject != null) {
            int h17 = (int) ik1.w.h(optJSONObject, "width", 0.0f);
            int h18 = (int) ik1.w.h(optJSONObject, "height", 0.0f);
            if (h17 != hVar.f444382q || h18 != hVar.f444383r) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + hVar.f444380o + "] size to [" + h17 + ", " + h18 + ']');
                hVar.f444382q = h17;
                hVar.f444383r = h18;
                android.view.Surface surface = hVar.f444380o;
                if (surface != null && (tVar = hVar.f444379n) != null) {
                    tVar.c(surface, h17, h18);
                }
            }
        }
        lVar.a(i17, k0Var.o("ok"));
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        if (motionEvent == null || (magicBrushView = this.f444381p) == null) {
            return;
        }
        magicBrushView.onTouchEvent(motionEvent);
    }

    @Override // eg.a, eg.b
    public synchronized void e() {
        gh.t tVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "plugin destroyed viewId: " + this.f444377i);
        android.view.Surface surface = this.f444380o;
        if (surface != null && (tVar = this.f444379n) != null) {
            tVar.a(surface, false);
        }
        this.f444380o = null;
    }

    @Override // eg.b
    public synchronized java.lang.String f(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        invokeContext.l();
        if ((invokeContext instanceof com.tencent.mm.plugin.appbrand.extendplugin.b ? (com.tencent.mm.plugin.appbrand.extendplugin.b) invokeContext : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "invokeContext type not supported");
            return null;
        }
        if (((com.tencent.mm.plugin.appbrand.extendplugin.b) invokeContext).f78021c instanceof xb1.b) {
            this.f444384s = ((com.tencent.mm.plugin.appbrand.extendplugin.b) invokeContext).f78020b.optBoolean("transparentBackground", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "is2DCanvas: " + this.f444384s);
        }
        if (!this.f444375g && !this.f444384s) {
            ((java.util.ArrayList) this.f444378m).add(invokeContext);
            return null;
        }
        u(invokeContext);
        return null;
    }

    @Override // gh.r
    public java.lang.Object getSurface() {
        return gh.q.a(this);
    }

    @Override // gh.r
    public android.view.View getThisView() {
        return null;
    }

    @Override // gh.r
    public gh.y getViewType() {
        return gh.y.VirtualView;
    }

    @Override // eg.a, eg.b
    public synchronized void i(android.view.Surface surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "handlePluginReady mViewId:" + this.f444377i + " inited:" + this.f444375g + " id:" + this.f252497d);
        android.view.Surface surface2 = this.f444380o;
        if (surface2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "destroy previous surface " + surface2);
            gh.t tVar = this.f444379n;
            if (tVar != null) {
                tVar.a(surface2, false);
            }
        }
        this.f444380o = surface;
        if (!this.f444375g && !this.f444384s) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f444378m;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u((sf.f) it.next());
                }
                arrayList.clear();
            }
            this.f444375g = true;
        }
        v();
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.tencent.magicbrush.MBRuntime runtime) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(runtime, "runtime");
    }

    @Override // gh.r
    public void onDestroy() {
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        i(new android.view.Surface(surfaceTexture));
    }

    @Override // gh.r
    public void setSurfaceListener(gh.t tVar) {
        this.f444379n = tVar;
    }

    public final void u(sf.f fVar) {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b ? (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar : null;
        if (bVar == null || (m17 = bVar.m()) == null) {
            return;
        }
        wb1.a aVar = new wb1.a(this, fVar, m17);
        qu5.a asyncHandler = m17.getAsyncHandler();
        if (kotlin.jvm.internal.o.b(asyncHandler != null ? asyncHandler.getLooper() : null, android.os.Looper.myLooper())) {
            aVar.run();
            return;
        }
        qu5.a asyncHandler2 = m17.getAsyncHandler();
        if (asyncHandler2 != null) {
            asyncHandler2.post(aVar);
        }
    }

    public final void v() {
        gh.t tVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + this.f444380o + "]: width:" + this.f444382q + ", height:" + this.f444383r + ' ');
        android.view.Surface surface = this.f444380o;
        if (surface == null || (tVar = this.f444379n) == null) {
            return;
        }
        tVar.b(surface, this.f444382q, this.f444383r, false, this.f444384s);
    }
}
