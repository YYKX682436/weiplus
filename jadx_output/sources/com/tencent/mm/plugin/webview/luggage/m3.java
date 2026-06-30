package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class m3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182558d;

    public m3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182558d = w3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.xweb.d1 hitTestResult;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182558d;
        w3Var.f182660a = null;
        w3Var.f182665f = null;
        w3Var.f182664e = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) w3Var.f182668i).n();
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = w3Var.f182669j;
        if (e0Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        try {
            if (view instanceof android.webkit.WebView) {
                com.tencent.xweb.d1 hitTestResult2 = e0Var.f182180p.getHitTestResult();
                if (hitTestResult2 != null && ((i18 = hitTestResult2.f220239a) == 5 || i18 == 8)) {
                    w3Var.d(hitTestResult2);
                }
            } else if ((view instanceof com.tencent.mm.ui.widget.MMWebView) && (hitTestResult = ((com.tencent.mm.ui.widget.MMWebView) view).getHitTestResult()) != null && ((i17 = hitTestResult.f220239a) == 5 || i17 == 8)) {
                w3Var.c(hitTestResult);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
