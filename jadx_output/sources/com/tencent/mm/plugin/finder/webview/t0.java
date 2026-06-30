package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class t0 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136927a;

    public t0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136927a = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136927a;
        if (n1Var.h()) {
            return;
        }
        try {
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            int Sg = n1Var.f().getInvoke().Sg(str);
            android.app.Activity activity = (android.app.Activity) n1Var.c();
            com.tencent.mm.plugin.finder.webview.v0 v0Var = new com.tencent.mm.plugin.finder.webview.v0(n1Var);
            ((com.tencent.mm.pluginsdk.model.s1) e4Var).getClass();
            com.tencent.mm.plugin.fav.ui.u1.g(Sg, 34, activity, v0Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }
}
