package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class hc0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f134619d;

    public hc0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        this.f134619d = nc0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int childCount = recyclerView.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = recyclerView.getChildAt(i19);
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(childAt);
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
            int top = childAt.getTop();
            com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f134619d;
            double min = java.lang.Math.min(java.lang.Math.abs((top - nc0Var.f135319q.f224749f) - nc0Var.f135322t) / childAt.getHeight(), 1.0d) * 0.5d;
            android.view.View p17 = ((in5.s0) w07).p(com.tencent.mm.R.id.f486689m54);
            if (p17 != null) {
                p17.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb((int) (min * 255), 0, 0, 0)));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
