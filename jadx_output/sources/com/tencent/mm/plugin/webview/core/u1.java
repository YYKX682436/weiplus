package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class u1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181991a;

    public u1(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181991a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://jump/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181991a;
        if (!((e3Var.R.b().f192177d & 2) > 0)) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "ActivityJumpHandler not allow, no inner url generalcontrol, url = %s", url);
            return true;
        }
        try {
            e3Var.e0().m(url, e3Var.R.c().f(7));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(e3Var.o1(), "ActivityJumpHandler, ex = " + e17.getMessage());
        }
        return true;
    }
}
