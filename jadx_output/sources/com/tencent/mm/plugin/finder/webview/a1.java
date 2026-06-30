package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class a1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136825d;

    public a1(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136825d = n1Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hy4.h0 h0Var = new hy4.h0();
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136825d;
        n1Var.f136904h = h0Var;
        h0Var.f286111e = 1;
        h0Var.f286107a = java.lang.System.currentTimeMillis();
        n1Var.f136897a.clear();
        n1Var.f136900d = null;
        n1Var.f136899c = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) n1Var.f136903g).n();
        if (n1Var.f().getWebView() == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (!n1Var.h()) {
            try {
                if (view instanceof android.webkit.WebView) {
                    com.tencent.xweb.d1 hitTestResult2 = n1Var.f().getWebView().getHitTestResult();
                    if (hitTestResult2 != null && ((i18 = hitTestResult2.f220239a) == 5 || i18 == 8)) {
                        n1Var.k(hitTestResult2);
                    }
                } else if ((view instanceof com.tencent.mm.ui.widget.MMWebView) && (hitTestResult = ((com.tencent.mm.ui.widget.MMWebView) view).getHitTestResult()) != null && ((i17 = hitTestResult.f220239a) == 5 || i17 == 8)) {
                    n1Var.j(hitTestResult);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
