package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class a2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181758a;

    public a2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181758a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://connectToFreeWifi/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.w(this.f181758a.o1(), "freewifi had Deprecated");
        return true;
    }
}
