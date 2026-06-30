package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187621d;

    public z3(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187621d = o4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187621d;
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        if (r0Var != null) {
            r0Var.V0(r0Var.i(), true, 8);
        }
        android.view.View view2 = o4Var.f187470o;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController", "refresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = o4Var.f187469n;
        if (progressBar != null) {
            progressBar.setVisibility(o4Var.f187464f.f187184j ? 0 : 8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
