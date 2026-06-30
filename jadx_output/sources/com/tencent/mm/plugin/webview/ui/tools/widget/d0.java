package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class d0 implements zg0.k3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f187143a;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f187147e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f187148f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f187150h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.c1 f187151i;

    /* renamed from: j, reason: collision with root package name */
    public db5.t4 f187152j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f187153k;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f187144b = new com.tencent.mm.sdk.platformtools.r2(12);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f187145c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final hy4.m0 f187146d = new hy4.m0();

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f187149g = new java.util.HashMap();

    public d0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f187150h = hashMap;
        this.f187153k = new java.util.ArrayList();
        hashMap.clear();
        hashMap.put("menuItem:share:appMessage", 1);
        hashMap.put("menuItem:share:timeline", 2);
        hashMap.put("menuItem:copyUrl", 6);
    }

    public static final boolean a(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17) {
        d0Var.getClass();
        if (jsapiPermissionWrapper == null) {
            return false;
        }
        int d17 = jsapiPermissionWrapper.d(i17);
        return d17 == 1 || d17 == 10;
    }

    public static final boolean b(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17) {
        d0Var.getClass();
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.d(i17) == 10;
    }

    public final boolean c(int i17) {
        android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) this.f187149g.get(e().f181916a.getUrl());
        return sparseBooleanArray == null || !sparseBooleanArray.get(i17, false);
    }

    public final android.content.Context d() {
        java.lang.ref.WeakReference weakReference = this.f187147e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        kotlin.jvm.internal.o.d(context);
        return context;
    }

    public final com.tencent.mm.plugin.webview.core.r0 e() {
        java.lang.ref.WeakReference weakReference = this.f187148f;
        com.tencent.mm.plugin.webview.core.r0 r0Var = weakReference != null ? (com.tencent.mm.plugin.webview.core.r0) weakReference.get() : null;
        kotlin.jvm.internal.o.d(r0Var);
        return r0Var;
    }

    public boolean f(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17, int i18) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.d(i17) == 1 && c(i18);
    }

    public final void g() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f187143a;
        if (k0Var != null) {
            if (k0Var.i()) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f187143a;
                kotlin.jvm.internal.o.d(k0Var2);
                k0Var2.u();
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f187143a;
            kotlin.jvm.internal.o.d(k0Var3);
            k0Var3.k();
            this.f187143a = null;
        }
        this.f187151i = null;
    }

    public final void h() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        android.view.Window d17;
        android.view.View decorView;
        if (this.f187147e == null || this.f187148f == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f187143a;
        if (!(k0Var2 != null && k0Var2.i())) {
            this.f187143a = new com.tencent.mm.ui.widget.dialog.k0(d(), 0, true);
        }
        this.f187146d.f286176d = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f187143a;
        if (k0Var3 != null) {
            k0Var3.C = new com.tencent.mm.plugin.webview.ui.tools.widget.v(this);
        }
        if (k0Var3 != null && (d17 = k0Var3.d()) != null && (decorView = d17.getDecorView()) != null) {
            decorView.addOnAttachStateChangeListener(new com.tencent.mm.plugin.webview.ui.tools.widget.w(this));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.f187143a;
        if (k0Var4 != null) {
            k0Var4.D = new com.tencent.mm.plugin.webview.ui.tools.widget.x(this);
        }
        if (k0Var4 != null) {
            k0Var4.G = new com.tencent.mm.plugin.webview.ui.tools.widget.y(this);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.c0 c0Var = new com.tencent.mm.plugin.webview.ui.tools.widget.c0(this);
        if (k0Var4 != null) {
            k0Var4.f211881s = c0Var;
        }
        if (k0Var4 != null) {
            k0Var4.f211884v = c0Var;
        }
        com.tencent.mm.protocal.JsapiPermissionWrapper c17 = e().R.c();
        kotlin.jvm.internal.o.f(c17, "getJsPerm(...)");
        com.tencent.mm.ui.widget.dialog.k0 k0Var5 = this.f187143a;
        if (k0Var5 != null) {
            k0Var5.f211872n = new com.tencent.mm.plugin.webview.ui.tools.widget.z(this, c17);
        }
        if (k0Var5 != null) {
            k0Var5.f211874o = new com.tencent.mm.plugin.webview.ui.tools.widget.a0(this, c17);
        }
        if (k0Var5 != null) {
            k0Var5.f211854d = new com.tencent.mm.plugin.webview.ui.tools.widget.b0(this);
        }
        java.lang.String Z = e().Z();
        if (Z == null) {
            Z = e().i();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Z)) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var6 = this.f187143a;
            if (k0Var6 != null) {
                k0Var6.q(" ", 1);
            }
        } else {
            java.lang.String host = android.net.Uri.parse(Z).getHost();
            java.lang.String string = d().getString(com.tencent.mm.R.string.l6m, host);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(host) && (k0Var = this.f187143a) != null) {
                k0Var.q(string, 1);
            }
        }
        try {
            com.tencent.mm.ui.widget.dialog.k0 k0Var7 = this.f187143a;
            if (k0Var7 != null) {
                k0Var7.v();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "tryShow ex %s", e17.getMessage());
        }
        if (e().g0() != null) {
            e().g0().U("");
        }
    }
}
