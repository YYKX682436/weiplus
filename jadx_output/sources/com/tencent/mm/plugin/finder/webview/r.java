package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class r extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f136918a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f136919b;

    /* renamed from: c, reason: collision with root package name */
    public final zg0.o3 f136920c;

    public r(java.lang.ref.WeakReference activity, java.lang.ref.WeakReference control) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(control, "control");
        this.f136918a = activity;
        this.f136919b = control;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        this.f136920c = new com.tencent.mm.plugin.webview.modeltools.o0();
        android.app.Activity activity2 = (android.app.Activity) activity.get();
        if (activity2 != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.qa0 qa0Var = (com.tencent.mm.plugin.finder.viewmodel.component.qa0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.qa0.class);
            if (qa0Var == null || qa0Var.f135679d != null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderWebClientUIC", "create chooser");
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            qa0Var.f135679d = new com.tencent.mm.plugin.webview.modeltools.n();
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage message) {
        kotlin.jvm.internal.o.g(message, "message");
        cf.o.a(message, "Finder.FinderWebChromeClient", false);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
        zg0.q2 q2Var;
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = (android.app.Activity) this.f136918a.get();
        if (activity == null || (q2Var = (zg0.q2) this.f136919b.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.modeltools.o0) this.f136920c).g(activity, ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z(), q2Var.i(), ((com.tencent.mm.plugin.webview.core.e3) q2Var).Q(), c01.z1.r(), origin, callback);
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        android.app.Activity activity = (android.app.Activity) this.f136918a.get();
        if (activity != null) {
            zg0.o3 o3Var = this.f136920c;
            zg0.q2 q2Var = (zg0.q2) this.f136919b.get();
            ((com.tencent.mm.plugin.webview.modeltools.o0) o3Var).h(permissionRequest, activity, q2Var != null ? ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z() : null);
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean q(com.tencent.xweb.WebView webView, android.webkit.ValueCallback valueCallback, com.tencent.xweb.r0 r0Var) {
        zg0.s2 s2Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderWebChromeClient", "showChooser");
        kotlin.jvm.internal.o.d(r0Var);
        if (r0Var.c() != 0 && r0Var.c() != 1) {
            return false;
        }
        if (r0Var.b() != null) {
            java.lang.String[] b17 = r0Var.b();
            kotlin.jvm.internal.o.f(b17, "getAcceptTypes(...)");
            if (!(b17.length == 0)) {
                java.lang.String[] b18 = r0Var.b();
                java.lang.String str = r0Var.d() ? "true" : "false";
                com.tencent.mars.xlog.Log.i("Finder.FinderWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
                android.app.Activity activity = (android.app.Activity) this.f136918a.get();
                if (activity != null) {
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.qa0 qa0Var = (com.tencent.mm.plugin.finder.viewmodel.component.qa0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(com.tencent.mm.plugin.finder.viewmodel.component.qa0.class);
                    if (qa0Var != null && (s2Var = qa0Var.f135679d) != null) {
                        zg0.q2 q2Var = (zg0.q2) this.f136919b.get();
                        ((com.tencent.mm.plugin.webview.modeltools.n) s2Var).c(activity, q2Var != null ? ((com.tencent.mm.plugin.webview.core.r0) q2Var).R : null, valueCallback, b18, str, r0Var.a(), r0Var.c());
                    }
                }
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        return true;
    }
}
