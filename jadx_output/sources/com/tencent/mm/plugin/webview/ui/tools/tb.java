package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class tb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186910d;

    public tb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186910d = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186910d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView != null && mMWebView.canGoBack()) {
            webViewUI.o8();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
