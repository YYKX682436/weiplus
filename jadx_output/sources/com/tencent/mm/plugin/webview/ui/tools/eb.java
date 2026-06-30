package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class eb implements android.view.View.OnLongClickListener {
    public eb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$32", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$32", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
