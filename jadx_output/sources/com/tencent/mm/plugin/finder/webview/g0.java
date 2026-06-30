package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.l0 f136869d;

    public g0(com.tencent.mm.plugin.finder.webview.l0 l0Var) {
        this.f136869d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/FinderWebViewScrollViewWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f136869d.f136892l.reload();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/FinderWebViewScrollViewWrapper$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
