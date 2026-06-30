package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ka implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185615a;

    public ka(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185615a = webViewUI;
    }

    @Override // z41.b
    public void a(z41.a aVar, z41.a aVar2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "OrientationListener lastOrientation:" + aVar.name() + "; newOrientation:" + aVar2.name());
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185615a;
        webViewUI.A = 4;
        webViewUI.setMMOrientation();
        z41.c cVar = webViewUI.D;
        if (cVar != null) {
            cVar.disable();
        }
    }
}
