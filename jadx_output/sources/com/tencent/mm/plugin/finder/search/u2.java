package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.v2 f125875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f125876e;

    public u2(com.tencent.mm.plugin.finder.search.v2 v2Var, ya2.b2 b2Var) {
        this.f125875d = v2Var;
        this.f125876e = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.v2 v2Var = this.f125875d;
        boolean z17 = v2Var.f125927f;
        ya2.b2 b2Var = this.f125876e;
        if (z17) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract finderFollowListContract = com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.f122599a;
            android.content.Context context = v2Var.itemView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            finderFollowListContract.a((com.tencent.mm.ui.MMActivity) context, b2Var, false);
        }
        android.content.Context context2 = v2Var.f125938t.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        zy2.cc.a(new com.tencent.mm.plugin.finder.view.er(context2, b2Var != null ? b2Var.D0() : null, v2Var.getAdapterPosition(), false, 0L, 16, null), false, true, null, 0, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactItemHolder$onBindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
