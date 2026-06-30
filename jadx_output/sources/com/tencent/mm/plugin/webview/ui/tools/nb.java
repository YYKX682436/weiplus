package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class nb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185868d;

    public nb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185868d = webViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f185868d, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI");
        intent.putExtra("entry_fix_tools", 1);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185868d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(webViewUI, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$39", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(webViewUI, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$39", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
