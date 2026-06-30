package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class i2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181850a;

    public i2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181850a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://private/gethtml/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181850a;
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String substring = url.substring(25);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        try {
            java.lang.String decode = java.net.URLDecoder.decode(substring);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("nowUrl", e3Var.B1);
            java.lang.String stringExtra = e3Var.d0().getStringExtra("tweetid");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            bundle.putString("tweetid", stringExtra);
            bundle.putString("htmlData", decode);
            bundle.putInt("type", e3Var.d0().getIntExtra("type", 0));
            e3Var.e0().ng(3, bundle, e3Var.U());
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "edw ViewImageGetHtmlHandler handleUrl, ex = " + e17.getMessage());
            return false;
        }
    }
}
