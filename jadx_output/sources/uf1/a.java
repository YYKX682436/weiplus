package uf1;

/* loaded from: classes7.dex */
public class a extends eg.a {

    /* renamed from: o, reason: collision with root package name */
    public static uf1.g f427137o;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f427138g;

    /* renamed from: h, reason: collision with root package name */
    public tb1.b0 f427139h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f427140i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f427141m = new java.util.Vector();

    /* renamed from: n, reason: collision with root package name */
    public int f427142n;

    public static void r(uf1.a aVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        android.view.View view = aVar.f427139h.getView();
        com.tencent.mm.plugin.appbrand.jsapi.s customViewContainer = tVar.getCustomViewContainer();
        android.view.ViewGroup n17 = customViewContainer != null ? ((com.tencent.mm.plugin.appbrand.page.ia) customViewContainer).n(0, false, false) : null;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "addCameraNativeView failed null topLevelContainer, appId:%s", tVar.getAppId());
            return;
        }
        view.setId(view.hashCode());
        if (n17.findViewById(view.getId()) == null) {
            n17.addView(view, new android.view.ViewGroup.LayoutParams(1, 1));
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        tb1.b0 b0Var = this.f427139h;
        if (b0Var != null) {
            com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView sameLayerCameraView = (com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView) b0Var;
            if (sameLayerCameraView.getRecordView() == null) {
                return;
            }
            sameLayerCameraView.getRecordView().a(motionEvent);
        }
    }

    @Override // eg.a, eg.b
    public void e() {
        android.view.Surface surface = this.f427138g;
        if (surface != null) {
            surface.release();
            this.f427138g = null;
        }
        tb1.b0 b0Var = this.f427139h;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "the camera view is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f427140i;
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) lVar;
            tVar.I(b0Var);
            tVar.O(this.f427139h);
            tVar.K(this.f427139h);
        }
        if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) this.f427139h).i();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: uf1.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) uf1.a.this.f427139h).i();
                }
            });
        }
    }

    @Override // eg.b
    public java.lang.String f(sf.f fVar) {
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = bVar.m();
        int i17 = bVar.f78019a;
        java.lang.String q17 = q();
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = bVar.f78021c;
        java.lang.String k17 = k0Var.k();
        org.json.JSONObject jSONObject = bVar.f78020b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        m17.m(new uf1.c(this, k0Var, new uf1.b(this, m17, k0Var, fVar, jSONObject, i17)));
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        this.f427138g = surface;
        java.util.List list = this.f427141m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "preTask size: %d", java.lang.Integer.valueOf(((java.util.Vector) list).size()));
        java.util.Iterator it = ((java.util.Vector) list).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }
}
