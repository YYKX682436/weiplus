package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes3.dex */
public class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187706d;

    public yb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f187706d = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187706d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(webViewUI, com.tencent.mm.R.anim.f477802bv);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.webview.ui.tools.xb(this));
        webViewUI.f183863v.startAnimation(loadAnimation);
        android.view.View view2 = webViewUI.f183863v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$50", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$50", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
