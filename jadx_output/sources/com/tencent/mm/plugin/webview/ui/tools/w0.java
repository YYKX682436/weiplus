package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class w0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI f187006d;

    public w0(com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI) {
        this.f187006d = qRCodeIntroductionWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f187006d.finish();
        return true;
    }
}
