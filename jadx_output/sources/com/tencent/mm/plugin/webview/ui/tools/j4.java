package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f184857d;

    public j4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI) {
        this.f184857d = webViewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f184857d;
        webViewDownloadUI.X6(2);
        webViewDownloadUI.W6();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
