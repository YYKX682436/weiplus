package tf;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final eg.a f418787a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.x0 f418788b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f418789c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f418790d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f418791e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f418792f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.f0 f418793g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.w f418794h = null;

    public c(eg.a aVar, com.tencent.mm.plugin.appbrand.jsapi.x0 x0Var) {
        this.f418787a = aVar;
        this.f418788b = x0Var;
    }

    public abstract void a(java.lang.String str, sf.f fVar);

    public abstract boolean b();

    public void c(sf.f fVar) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (this.f418789c != null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        if (m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            v5Var = (com.tencent.mm.plugin.appbrand.page.v5) m17;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + m17 + ") is not AppBrandPageView");
            if (!(m17 instanceof com.tencent.mm.plugin.appbrand.e9)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + m17 + ") is not AppBrandService");
                return;
            }
            v5Var = ((com.tencent.mm.plugin.appbrand.e9) m17).V0();
        }
        if (!this.f418792f) {
            if (this.f418793g == null) {
                this.f418793g = new tf.a(this);
                this.f418794h = new tf.b(this);
            }
            android.app.Activity v17 = v5Var.v1();
            if (v17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "listenOrientationChanged, null == activity");
            } else {
                com.tencent.mm.plugin.appbrand.platform.window.activity.e0 b17 = com.tencent.mm.plugin.appbrand.platform.window.activity.e0.b(v17);
                com.tencent.mm.plugin.appbrand.platform.window.activity.f0 orientationObserver = this.f418793g;
                kotlin.jvm.internal.o.g(orientationObserver, "orientationObserver");
                b17.a(true);
                ((java.util.concurrent.CopyOnWriteArrayList) b17.f87586f).add(orientationObserver);
                v5Var.w(this.f418794h);
                this.f418792f = true;
            }
        }
        this.f418789c = new java.lang.ref.WeakReference(v5Var);
    }
}
