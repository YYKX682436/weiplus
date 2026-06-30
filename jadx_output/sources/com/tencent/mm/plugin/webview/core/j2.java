package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class j2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f181857b;

    public j2(com.tencent.mm.plugin.webview.core.e3 e3Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f181856a = e3Var;
        this.f181857b = mMWebView;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://viewimage/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181856a;
        kotlin.jvm.internal.o.g(url, "url");
        try {
            if (!e3Var.e0().isSDCardAvailable()) {
                e3Var.e0().ng(2, null, e3Var.U());
                return true;
            }
            java.lang.String substring = url.substring(19);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            e3Var.B1 = substring;
            com.tencent.mars.xlog.Log.i(e3Var.o1(), "viewimage currentUrl :" + e3Var.B1);
            e3Var.F1.getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.i(this.f181857b, "weixin://private/gethtml/", "'<head>' + document.getElementsByTagName('head')[0].innerHTML + '</head><body>' + document.getElementsByTagName('body')[0].innerHTML + '</body>'", e3Var.C1);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "edw handleUrl, ex = " + e17.getMessage());
            return false;
        }
    }
}
