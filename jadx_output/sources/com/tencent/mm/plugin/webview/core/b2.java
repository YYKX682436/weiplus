package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class b2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181763a;

    public b2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181763a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://gethtml/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        java.lang.String substring = url.substring(17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181763a;
        com.tencent.mars.xlog.Log.i(e3Var.o1(), "[oneliang]get html content :".concat(substring));
        e3Var.getClass();
        java.util.Iterator it = e3Var.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).o(substring);
        }
        return false;
    }
}
