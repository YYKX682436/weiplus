package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184339e;

    public a3(int i17, int i18, int i19, com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184338d = i17;
        this.f184339e = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI;
        db5.d5 d5Var;
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184339e;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI2 = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) j3Var.f184452b.get();
        if (baseSearchWebViewUI2 != null) {
            baseSearchWebViewUI2.da(j3Var.D);
        }
        android.content.Context context = j3Var.f184451a;
        if (this.f184338d == 12) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.mul);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(string);
            u1Var.a(true);
            u1Var.c(null, null);
            u1Var.q(false);
        } else {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.mum);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var2.g(string2);
            u1Var2.a(true);
            u1Var2.c(null, null);
            u1Var2.q(false);
        }
        db5.d5 d5Var2 = j3Var.f184462l;
        if (d5Var2 != null) {
            if ((d5Var2.isShowing()) && (d5Var = j3Var.f184462l) != null) {
                d5Var.dismiss();
            }
        }
        java.lang.ref.WeakReference weakReference = j3Var.f184452b;
        if (weakReference == null || (baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) weakReference.get()) == null) {
            return;
        }
        baseSearchWebViewUI.R9();
    }
}
