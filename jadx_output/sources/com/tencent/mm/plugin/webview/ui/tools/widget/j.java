package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class j extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187332a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187333b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187334c;

    /* renamed from: d, reason: collision with root package name */
    public int f187335d;

    /* renamed from: e, reason: collision with root package name */
    public final zg0.o3 f187336e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f187337f;

    public j(java.lang.ref.WeakReference activityWeakRef, java.lang.ref.WeakReference controllerWeakRef, java.lang.ref.WeakReference commWebViewWeakRef) {
        kotlin.jvm.internal.o.g(activityWeakRef, "activityWeakRef");
        kotlin.jvm.internal.o.g(controllerWeakRef, "controllerWeakRef");
        kotlin.jvm.internal.o.g(commWebViewWeakRef, "commWebViewWeakRef");
        this.f187332a = activityWeakRef;
        this.f187333b = controllerWeakRef;
        this.f187334c = commWebViewWeakRef;
        ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
        this.f187336e = new com.tencent.mm.plugin.webview.modeltools.o0();
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage message) {
        kotlin.jvm.internal.o.g(message, "message");
        cf.o.a(message, "MicroMsg.CommWebChromeClient", false);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(callback, "callback");
        zg0.o3 o3Var = this.f187336e;
        android.app.Activity s17 = s();
        kotlin.jvm.internal.o.d(s17);
        java.lang.ref.WeakReference weakReference = this.f187333b;
        java.lang.Object obj = weakReference.get();
        kotlin.jvm.internal.o.d(obj);
        java.lang.String Z = ((com.tencent.mm.plugin.webview.core.r0) obj).Z();
        java.lang.Object obj2 = weakReference.get();
        kotlin.jvm.internal.o.d(obj2);
        java.lang.String i17 = ((com.tencent.mm.plugin.webview.core.r0) obj2).i();
        java.lang.Object obj3 = weakReference.get();
        kotlin.jvm.internal.o.d(obj3);
        int Q = ((com.tencent.mm.plugin.webview.core.r0) obj3).Q();
        android.app.Activity s18 = s();
        kotlin.jvm.internal.o.d(s18);
        ((com.tencent.mm.plugin.webview.modeltools.o0) o3Var).g(s17, Z, i17, Q, s18.getIntent().getStringExtra("geta8key_username"), origin, callback);
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView view, java.lang.String url, java.lang.String message, com.tencent.xweb.z result) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert");
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = false;
        android.app.Activity s17 = s();
        kotlin.jvm.internal.o.d(s17);
        if (s17.isFinishing()) {
            result.a();
            return true;
        }
        int i17 = this.f187335d + 1;
        this.f187335d = i17;
        if (i17 > 2) {
            android.app.Activity s18 = s();
            android.app.Activity s19 = s();
            kotlin.jvm.internal.o.d(s19);
            java.lang.String string = s19.getString(com.tencent.mm.R.string.lao);
            android.app.Activity s27 = s();
            kotlin.jvm.internal.o.d(s27);
            this.f187337f = db5.e1.B(s18, message, "", string, s27.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.a(url, this, result), new com.tencent.mm.plugin.webview.ui.tools.widget.b(pBool, result), com.tencent.mm.R.color.f479308vo);
        } else {
            android.app.Activity s28 = s();
            android.app.Activity s29 = s();
            kotlin.jvm.internal.o.d(s29);
            this.f187337f = db5.e1.y(s28, message, "", s29.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.c(pBool, result));
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f187337f;
        if (j0Var == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(j0Var);
        j0Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.widget.d(pBool, result));
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.f187337f;
        kotlin.jvm.internal.o.d(j0Var2);
        j0Var2.setCanceledOnTouchOutside(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var3 = this.f187337f;
        kotlin.jvm.internal.o.d(j0Var3);
        j0Var3.o(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView view, java.lang.String url, java.lang.String message, com.tencent.xweb.z result) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm");
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = false;
        android.app.Activity s17 = s();
        kotlin.jvm.internal.o.d(s17);
        if (s17.isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm finish");
            result.a();
            return true;
        }
        int i17 = this.f187335d + 1;
        this.f187335d = i17;
        if (i17 > 2) {
            android.app.Activity s18 = s();
            android.app.Activity s19 = s();
            kotlin.jvm.internal.o.d(s19);
            java.lang.String string = s19.getString(com.tencent.mm.R.string.lao);
            android.app.Activity s27 = s();
            kotlin.jvm.internal.o.d(s27);
            this.f187337f = db5.e1.B(s18, message, "", string, s27.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.e(url, this, result), new com.tencent.mm.plugin.webview.ui.tools.widget.f(pBool, result, this), com.tencent.mm.R.color.f478749g4);
        } else {
            android.app.Activity s28 = s();
            android.app.Activity s29 = s();
            kotlin.jvm.internal.o.d(s29);
            java.lang.String string2 = s29.getString(com.tencent.mm.R.string.f490507x1);
            android.app.Activity s37 = s();
            kotlin.jvm.internal.o.d(s37);
            this.f187337f = db5.e1.K(s28, false, message, "", string2, s37.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webview.ui.tools.widget.g(pBool, result, this), new com.tencent.mm.plugin.webview.ui.tools.widget.h(result, this));
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f187337f;
        if (j0Var == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(j0Var);
        j0Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.widget.i(this, pBool, result));
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.f187337f;
        kotlin.jvm.internal.o.d(j0Var2);
        j0Var2.setCancelable(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var3 = this.f187337f;
        kotlin.jvm.internal.o.d(j0Var3);
        j0Var3.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean k(com.tencent.xweb.WebView view, java.lang.String url, java.lang.String message, java.lang.String defaultValue, com.tencent.xweb.y result) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        kotlin.jvm.internal.o.g(result, "result");
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        zg0.o3 o3Var = this.f187336e;
        android.app.Activity s17 = s();
        kotlin.jvm.internal.o.d(s17);
        java.lang.Object obj = this.f187333b.get();
        kotlin.jvm.internal.o.d(obj);
        ((com.tencent.mm.plugin.webview.modeltools.o0) o3Var).h(request, s17, ((com.tencent.mm.plugin.webview.core.r0) obj).Z());
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187334c;
        if (weakReference != null && (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).r(webView, str);
        }
        java.lang.ref.WeakReference weakReference2 = this.f187333b;
        com.tencent.mm.plugin.webview.core.r0 r0Var = weakReference2 != null ? (com.tencent.mm.plugin.webview.core.r0) weakReference2.get() : null;
        if (r0Var == null) {
            return;
        }
        r0Var.f181946p = str;
    }

    public final android.app.Activity s() {
        return (android.app.Activity) this.f187332a.get();
    }
}
