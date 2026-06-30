package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class z1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f182030a;

    public z1(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f182030a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://feedback/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f182030a;
        kotlin.jvm.internal.o.g(url, "url");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("MMActivity.OverrideEnterAnimation", 0);
        bundle.putInt("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        try {
            e3Var.e0().ng(7, bundle, e3Var.U());
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(e3Var.o1(), "FeedbackJumpHandler, ex = " + e17.getMessage());
            return true;
        }
    }
}
