package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136867d;

    public f1(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136867d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136867d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = n1Var.f136902f;
        if (k0Var != null && k0Var.i()) {
            n1Var.f136902f.u();
        }
        com.tencent.mm.plugin.scanner.c0.b(n1Var.f().getContext(), n1Var.f().getWebView(), n1Var.f136897a, n1Var.f().getWVTopOffset(), new com.tencent.mm.plugin.finder.webview.e1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
