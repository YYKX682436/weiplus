package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186870d;

    public sa(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186870d = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186870d;
        webViewUI.X8();
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
        if (e3Var != null) {
            e3Var.O0(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
