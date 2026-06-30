package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class s0 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136926a;

    public s0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136926a = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "share image to friend fail, imgPath is null");
            return;
        }
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136926a;
        if (n1Var.h()) {
            return;
        }
        try {
            n1Var.f().getInvoke().X9(str, ((com.tencent.mm.plugin.webview.core.r0) n1Var.f().getWebViewController()).U(), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "sendImgToFriend fail, ex = " + e17.getMessage());
        }
    }
}
