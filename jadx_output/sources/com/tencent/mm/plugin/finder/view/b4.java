package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f131689d;

    public b4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f131689d = finderCollapsibleTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f131689d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.neattextview.textview.view.NeatTextView");
        try {
            i17 = ((com.tencent.neattextview.textview.view.NeatTextView) view).getLayout().l(finderCollapsibleTextView.getLimitLine() - 1);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            i17 = -1;
        }
        boolean z17 = finderCollapsibleTextView.isCollapse;
        if ((z17 && i17 > 0) || !z17) {
            finderCollapsibleTextView.g();
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            android.content.Context context = finderCollapsibleTextView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            o3Var.vk(context, false, 2, finderCollapsibleTextView.isCollapse, finderCollapsibleTextView.isTopicExpand);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
