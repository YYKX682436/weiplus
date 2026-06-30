package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rb extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tb f114121d;

    public rb(com.tencent.mm.plugin.finder.live.plugin.tb tbVar) {
        this.f114121d = tbVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f114121d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = tbVar.t1().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
        se2.a0 v17 = tbVar.v1();
        long j17 = y17;
        long j18 = tbVar.v1().f406833b;
        if (j17 < j18) {
            j17 = j18;
        }
        v17.f406833b = j17;
        ((mm2.e0) tbVar.P0(mm2.e0.class)).U6(y17 == tbVar.u1() - 1);
        if (y17 == tbVar.u1() - 1) {
            java.lang.Object value = ((jz5.n) ((se2.e0) ((jz5.n) tbVar.f114378z).getValue()).f406853c).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.view.ViewGroup) value).setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
