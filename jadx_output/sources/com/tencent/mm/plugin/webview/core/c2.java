package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class c2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181773a;

    public c2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181773a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://profile/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String substring = url.substring(17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        boolean z17 = substring.length() == 0;
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181773a;
        if (z17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "handleUrl fail, username is null");
            return true;
        }
        if (e3Var.R.c().f(2)) {
            nw4.n g07 = e3Var.g0();
            if (g07.f340895i) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = g07.f340892f;
                if (n3Var != null) {
                    n3Var.post(new nw4.m0(g07, substring));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGoProfile fail, not ready");
            }
        }
        return true;
    }
}
