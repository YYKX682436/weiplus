package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.e3 f182875a;

    /* renamed from: b, reason: collision with root package name */
    public int f182876b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f182877c;

    public static final void a(com.tencent.mm.plugin.webview.model.f3 f3Var) {
        com.tencent.mm.plugin.webview.model.l2 l2Var;
        java.lang.ref.WeakReference weakReference = f3Var.f182877c;
        if (weakReference != null && ((com.tencent.mm.plugin.webview.model.l2) weakReference.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[goBackWebview]");
            java.lang.ref.WeakReference weakReference2 = f3Var.f182877c;
            if (weakReference2 != null && (l2Var = (com.tencent.mm.plugin.webview.model.l2) weakReference2.get()) != null) {
                ((com.tencent.mm.plugin.webview.core.o2) l2Var).d();
            }
        }
        f3Var.c();
    }

    public static final void b(com.tencent.mm.plugin.webview.model.f3 f3Var, java.lang.String str) {
        com.tencent.mm.plugin.webview.model.l2 l2Var;
        java.lang.ref.WeakReference weakReference = f3Var.f182877c;
        if (weakReference != null && ((com.tencent.mm.plugin.webview.model.l2) weakReference.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[goRedirectWebview] redirectUrl = " + str);
            java.lang.ref.WeakReference weakReference2 = f3Var.f182877c;
            if (weakReference2 != null && (l2Var = (com.tencent.mm.plugin.webview.model.l2) weakReference2.get()) != null) {
                ((com.tencent.mm.plugin.webview.core.o2) l2Var).b(str, 9);
            }
        }
        f3Var.c();
    }

    public final void c() {
        com.tencent.mm.plugin.webview.model.y2 y2Var;
        fl1.c0 c0Var;
        fl1.c0 c0Var2;
        com.tencent.mm.plugin.webview.model.e3 e3Var = this.f182875a;
        if (e3Var != null && (c0Var2 = e3Var.f182857g) != null) {
            c0Var2.f();
            e3Var.f182857g = null;
            e3Var.f182856f = null;
        }
        com.tencent.mm.plugin.webview.model.e3 e3Var2 = this.f182875a;
        if (e3Var2 != null && (y2Var = e3Var2.f182856f) != null) {
            y2Var.f183194b.a(y2Var.f183195c);
            com.tencent.mm.plugin.webview.model.e3 e3Var3 = y2Var.f183196d;
            if (e3Var3 != null && (c0Var = e3Var3.f182857g) != null) {
                c0Var.f();
                e3Var3.f182857g = null;
                e3Var3.f182856f = null;
            }
            y2Var.f183196d = null;
        }
        this.f182875a = null;
        this.f182877c = null;
    }
}
