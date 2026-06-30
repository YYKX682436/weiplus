package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class v1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181995a;

    public v1(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181995a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://addfriend/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181995a;
        if (!e3Var.R.c().f(5)) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "AddFriendHandler, permission fail");
            return true;
        }
        java.lang.String substring = url.substring(19);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        if (com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("from_webview", true);
        bundle.putString("userName", substring);
        try {
            e3Var.e0().ng(8, bundle, e3Var.U());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(e3Var.o1(), "AddFriendHandler, ex = " + e17.getMessage());
        }
        return true;
    }
}
