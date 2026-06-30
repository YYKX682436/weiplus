package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class bc implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183997a;

    public bc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183997a = webViewUI;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        try {
            this.f183997a.K1.favEditTag();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "favorite edittag fail, ex = " + e17.getMessage());
        }
    }
}
