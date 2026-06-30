package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class u0 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136928a;

    public u0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136928a = n1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136928a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic share image to friend fail, imgPath is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("web_search_data_ui_image_path", str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(n1Var.f136905i)) {
                n1Var.f136905i = n1Var.f().getCurrentURL();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(n1Var.f136905i) || !(n1Var.f136905i.startsWith("http://mp.weixin.qq.com/s?") || n1Var.f136905i.startsWith("https://mp.weixin.qq.com/s?") || n1Var.f136905i.startsWith("http://mp.weixin.qq.com/s/") || n1Var.f136905i.startsWith("https://mp.weixin.qq.com/s/"))) {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            } else {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
            }
            n1Var.f().getInvoke().ng(53, bundle, ((com.tencent.mm.plugin.webview.core.r0) n1Var.f().getWebViewController()).U());
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e17.getLocalizedMessage());
        }
    }
}
