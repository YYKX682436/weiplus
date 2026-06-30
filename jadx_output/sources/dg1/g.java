package dg1;

/* loaded from: classes7.dex */
public class g extends eg.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f232279g = new com.tencent.mm.sdk.platformtools.n3(java.lang.String.format(java.util.Locale.ENGLISH, "MapThread_%d", java.lang.Integer.valueOf(this.f252497d)));

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f232280h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public volatile android.view.Surface f232281i;

    /* renamed from: m, reason: collision with root package name */
    public volatile vc1.a3 f232282m;

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        if (this.f232282m != null) {
            this.f232282m.onTouchEvent(motionEvent);
        }
    }

    @Override // eg.a, eg.b
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginDestroy %d", java.lang.Integer.valueOf(this.f252497d));
        if (this.f232281i != null) {
            this.f232281i.release();
            this.f232281i = null;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        dg1.c cVar = new dg1.c(this, k0Var, m17, jSONObject, i17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f232279g;
        if (n3Var.getLooper() == android.os.Looper.myLooper()) {
            cVar.run();
            return null;
        }
        n3Var.post(cVar);
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginReady %d", java.lang.Integer.valueOf(this.f252497d));
        this.f232281i = surface;
        this.f232279g.post(new dg1.a(this));
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }
}
