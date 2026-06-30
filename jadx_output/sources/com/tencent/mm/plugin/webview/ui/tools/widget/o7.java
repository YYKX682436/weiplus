package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter f187483d;

    public o7(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f187483d = webViewSearchContentInputFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMActivity.showVKB((android.app.Activity) this.f187483d.getContext());
    }
}
