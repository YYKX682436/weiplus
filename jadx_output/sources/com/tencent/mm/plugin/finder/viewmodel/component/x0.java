package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f136381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.d1 f136382e;

    public x0(com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var) {
        this.f136382e = d1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
            if (this.f136381d) {
                com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = this.f136382e;
                com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var2 = d1Var.f134069s;
                if (!(u0Var2 != null && u0Var2.f136076d == -1)) {
                    if (!(u0Var2 != null && u0Var2.f136076d == w17)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var3 = d1Var.f134069s;
                        if (currentTimeMillis - (u0Var3 != null ? u0Var3.f136077e : java.lang.System.currentTimeMillis()) > 1000 && (u0Var = d1Var.f134069s) != null) {
                            d1Var.U6(false, u0Var);
                        }
                    }
                }
            }
            this.f136381d = false;
        } else if (i17 == 1) {
            this.f136381d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
