package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class jb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184869d;

    public jb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184869d = webViewUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$37", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184869d;
        if (webViewUI.f183823h3 != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                ((ls1.l0) webViewUI.f183823h3).onLongClick(view);
                yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$37", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$37", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
