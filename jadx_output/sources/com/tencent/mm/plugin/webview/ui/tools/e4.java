package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class e4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f184128e;

    public e4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI, java.lang.String str) {
        this.f184128e = webViewDownloadUI;
        this.f184127d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        this.f184128e.V6(this.f184127d);
    }
}
