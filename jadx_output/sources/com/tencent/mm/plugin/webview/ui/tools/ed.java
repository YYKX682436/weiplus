package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ed implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f184145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f184146f;

    public ed(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, android.view.View view, zg0.q2 q2Var) {
        this.f184146f = ldVar;
        this.f184144d = view;
        this.f184145e = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f184144d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zg0.q2 q2Var = this.f184145e;
        if (q2Var instanceof com.tencent.mm.plugin.webview.core.r0) {
            com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f184146f;
            if (ldVar.f185656g.f181750p) {
                float f17 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).f181938l.f358714c;
                android.view.View view3 = this.f184144d;
                view3.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.fd(ldVar, view3, f17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
