package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class w1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f182002a;

    public w1(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f182002a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://webview/close/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f182002a;
        if (e3Var.R.c().f(17)) {
            e3Var.E0();
            return true;
        }
        com.tencent.mars.xlog.Log.e(e3Var.o1(), "close window permission fail");
        return true;
    }
}
