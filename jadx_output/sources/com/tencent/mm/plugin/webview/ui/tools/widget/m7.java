package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class m7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter f187417d;

    public m7(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f187417d = webViewSearchContentInputFooter;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.f187417d;
        if (!z17 && webViewSearchContentInputFooter.f187089m != null) {
            android.content.Context context = view.getContext();
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                ((com.tencent.mm.ui.MMActivity) context).hideVKB(webViewSearchContentInputFooter.f187084e);
            }
        }
        webViewSearchContentInputFooter.f187083d.setSelected(z17);
    }
}
