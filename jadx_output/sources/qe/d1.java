package qe;

/* loaded from: classes7.dex */
public class d1 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.websocket.libwcwss.WcwssNative f361935h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener f361936i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener f361937j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f361928a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f361929b = -1;

    /* renamed from: c, reason: collision with root package name */
    public uh1.a f361930c = null;

    /* renamed from: d, reason: collision with root package name */
    public javax.net.ssl.X509TrustManager f361931d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f361932e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f361933f = true;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f361934g = null;

    /* renamed from: k, reason: collision with root package name */
    public final qe.b1 f361938k = new qe.b1(this, new qe.x0(this));

    public void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        java.lang.Boolean bool;
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding");
        qe.c1 c1Var = (qe.c1) i95.n0.c(qe.c1.class);
        if (c1Var != null) {
            ((yc1.i0) c1Var).getClass();
            boolean z17 = true;
            if (1 < com.tencent.mars.xlog.Log.getLogLevel()) {
                bool = java.lang.Boolean.FALSE;
            } else {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_nativewss", "");
                bool = (string == null || !string.equalsIgnoreCase("close")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WcWssNativeSwitchDelegateImpl", "createWcWssBinding Command close");
                z17 = false;
            }
            this.f361932e = z17;
        }
        if (!this.f361932e) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xSwitch false");
            return;
        }
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsruntime is null");
            return;
        }
        this.f361934g = java.lang.String.valueOf(i17);
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding jsThreadHandler is null");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(f0Var);
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(lVar);
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f361933f = wi6;
            com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        qe.t0 t0Var = new qe.t0(this);
        com.tencent.mm.plugin.appbrand.jsruntime.y lifecycleOwner = (com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f361936i = new qe.g1(t0Var, lifecycleOwner);
        qe.v0 v0Var = new qe.v0(this, weakReference, weakReference2);
        com.tencent.mm.plugin.appbrand.jsruntime.y lifecycleOwner2 = (com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
        kotlin.jvm.internal.o.g(lifecycleOwner2, "lifecycleOwner");
        this.f361937j = new qe.j1(v0Var, lifecycleOwner2);
        f0Var.k0(new qe.w0(this, tVar));
    }

    public void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding mContextId:%s", this.f361928a);
        if (!this.f361932e) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding xSwitch false");
        } else if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "destroyWcWssBinding jsruntime is null");
        } else {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.f361938k);
        }
    }

    public void c(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mContextId:%s", this.f361928a);
        if (!this.f361932e) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss xSwitch false");
            return;
        }
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsruntime is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss jsThreadHandler is null");
            return;
        }
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener = this.f361936i;
        if (iWcWssReportListener instanceof qe.g1) {
            qe.g1 g1Var = (qe.g1) iWcWssReportListener;
            androidx.lifecycle.y lifecycleOwner = d0Var.getLifecycleOwner();
            g1Var.getClass();
            if (lifecycleOwner != null) {
                d75.b.g(new qe.f1(lifecycleOwner, g1Var));
            }
        }
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f361937j;
        if (iWcWssWebSocketListener instanceof qe.j1) {
            qe.j1 j1Var = (qe.j1) iWcWssWebSocketListener;
            androidx.lifecycle.y lifecycleOwner2 = d0Var.getLifecycleOwner();
            j1Var.getClass();
            if (lifecycleOwner2 != null) {
                d75.b.g(new qe.i1(lifecycleOwner2, j1Var));
            }
        }
        qe.c1 c1Var = (qe.c1) i95.n0.c(qe.c1.class);
        boolean z17 = false;
        if (c1Var != null) {
            ((yc1.i0) c1Var).getClass();
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wcwss_binding_close_when_suspend, 1) > 0) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss appId:%s, closeWcWssSocketsWhenSuspend:%b", d0Var.getAppId(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            d0Var.t3().N.a(new qe.z0(this, f0Var));
        }
        f0Var.k0(new qe.a1(this, d0Var));
    }
}
