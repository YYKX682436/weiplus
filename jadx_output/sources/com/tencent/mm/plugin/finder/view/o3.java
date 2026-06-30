package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f132761d;

    public o3(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f132761d = finderCollapsibleTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.q3 q3Var = com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView.f130881z;
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f132761d;
        finderCollapsibleTextView.g();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = finderCollapsibleTextView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o3Var.vk(context, false, 1, finderCollapsibleTextView.isCollapse, finderCollapsibleTextView.isTopicExpand);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
