package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class vb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186972d;

    public vb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186972d = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186972d;
        if (!webViewUI.f183816f2 && !webViewUI.f183819g2 && !webViewUI.isFinishing()) {
            com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
            if (e3Var != null) {
                e3Var.V0(e3Var.i(), true, 8);
            }
            android.view.View view2 = webViewUI.T1;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.webview.model.x5.a(webViewUI.F7(), 4);
        }
        webViewUI.W8();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
