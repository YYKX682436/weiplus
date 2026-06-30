package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class k4 implements fw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f185604b;

    public k4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI, java.lang.String str) {
        this.f185604b = webViewDownloadUI;
        this.f185603a = str;
    }

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewDownloadUI", "getDownloadAppInfo onFailed appId: %s, errType: %s, errCode: %s, errMsg: %s", this.f185603a, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        this.f185604b.Z6("download failed");
    }
}
