package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class m implements com.tencent.mm.plugin.webview.model.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f183543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183544b;

    public m(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f183544b = webViewStubProxyUI;
        this.f183543a = u3Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.h0
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183543a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI = this.f183544b;
        if (z17) {
            if (webViewStubProxyUI.f183470e != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("add_shortcut_status", true);
                try {
                    webViewStubProxyUI.f183470e.i(54, bundle);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e17.getMessage());
                }
            }
            db5.e1.o(webViewStubProxyUI, com.tencent.mm.R.string.la9, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.webview.stub.l(this));
            return;
        }
        dp.a.makeText(webViewStubProxyUI.getContext(), webViewStubProxyUI.getContext().getString(com.tencent.mm.R.string.la8), 0).show();
        if (webViewStubProxyUI.f183470e != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("add_shortcut_status", false);
            try {
                webViewStubProxyUI.f183470e.i(54, bundle2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e18.getMessage());
            }
        }
        webViewStubProxyUI.finish();
    }
}
