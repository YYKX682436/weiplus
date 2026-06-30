package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ub implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186949d;

    public ub(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186949d = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$48", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186949d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView != null && mMWebView.canGoForward()) {
            webViewUI.f183815f.goForward();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$48", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
