package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class n5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f185856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f185857e;

    public n5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f185857e = b5Var;
        this.f185856d = mMWebView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hy4.h0 h0Var = new hy4.h0();
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f185857e;
        b5Var.f183940h = h0Var;
        h0Var.f286111e = 1;
        h0Var.f286107a = java.lang.System.currentTimeMillis();
        b5Var.f183933a.clear();
        b5Var.f183936d = null;
        b5Var.f183935c = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) b5Var.f183939g).n();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f185856d;
        if (mMWebView == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        java.lang.String j17 = b5Var.j();
        b5Var.f183941i = j17;
        if (!((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.b5.f183928u).containsKey(b5Var.m(j17))) {
            java.lang.String str = b5Var.f183941i;
            if ((str == null || gm0.j1.s(zq1.a0.class) == null) ? false : ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
                mMWebView.evaluateJavascript("javascript:(typeof window.getWXLongPressImageEventConfig === 'function')?window.getWXLongPressImageEventConfig():{}", new com.tencent.mm.plugin.webview.ui.tools.m5(this, view));
                yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.b5.a(b5Var, view);
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
