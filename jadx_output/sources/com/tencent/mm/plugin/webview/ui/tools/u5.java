package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class u5 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186926a;

    public u5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f186926a = b5Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "share image to friend fail, imgPath is null");
        } else {
            com.tencent.mm.plugin.webview.ui.tools.b5.f(this.f186926a, str);
        }
    }
}
