package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class f4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.h4 f184168d;

    public f4(com.tencent.mm.plugin.webview.ui.tools.h4 h4Var) {
        this.f184168d = h4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.h4 h4Var = this.f184168d;
        g0Var.d(14217, h4Var.f184792g, 5, h4Var.f184794i, h4Var.f184789d, java.lang.Integer.valueOf(h4Var.f184797o.D));
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = h4Var.f184797o;
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.T6(webViewDownloadUI, h4Var.f184789d, h4Var.f184790e, h4Var.f184791f, h4Var.f184792g, h4Var.f184793h, h4Var.f184794i, h4Var.f184795m, webViewDownloadUI.E, h4Var.f184796n);
        dialogInterface.dismiss();
    }
}
