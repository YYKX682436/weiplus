package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI f186955d;

    public v0(com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI) {
        this.f186955d = qRCodeIntroductionWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI.A3;
        com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI = this.f186955d;
        db5.e1.h(qRCodeIntroductionWebViewUI, "", new java.lang.String[]{qRCodeIntroductionWebViewUI.getString(com.tencent.mm.R.string.jdx), qRCodeIntroductionWebViewUI.getString(com.tencent.mm.R.string.f492747hq0)}, "", false, new com.tencent.mm.plugin.webview.ui.tools.x0(qRCodeIntroductionWebViewUI));
        return true;
    }
}
