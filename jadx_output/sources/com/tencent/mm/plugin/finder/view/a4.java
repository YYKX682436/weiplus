package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class a4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f131617d;

    public a4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f131617d = finderCollapsibleTextView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f131617d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            rl5.r rVar = new rl5.r(finderCollapsibleTextView.getContext());
            rVar.f397354x = new com.tencent.mm.plugin.finder.view.w3(finderCollapsibleTextView);
            rVar.L = new com.tencent.mm.plugin.finder.view.x3(finderCollapsibleTextView);
            finderCollapsibleTextView.getContentTextView().setBackgroundResource(com.tencent.mm.R.color.f479313vt);
            com.tencent.mm.plugin.finder.view.FadeNeatTextView contentTextView = finderCollapsibleTextView.getContentTextView();
            com.tencent.mm.plugin.finder.view.y3 y3Var = new com.tencent.mm.plugin.finder.view.y3(finderCollapsibleTextView);
            com.tencent.mm.plugin.finder.view.z3 z3Var = new com.tencent.mm.plugin.finder.view.z3(finderCollapsibleTextView);
            int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
            rVar.h(contentTextView, y3Var, z3Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.CollapsibleTextView", "[enableContentTextViewClick] errMsg:" + e17.getMessage());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/FinderCollapsibleTextView$enableContentTextViewClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
