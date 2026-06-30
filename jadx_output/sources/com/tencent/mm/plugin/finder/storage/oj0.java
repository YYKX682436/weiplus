package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class oj0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.pj0 f127320d;

    public oj0(com.tencent.mm.plugin.finder.storage.pj0 pj0Var) {
        this.f127320d = pj0Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.plugin.finder.storage.pj0 pj0Var = this.f127320d;
        if (pj0Var.f127378d) {
            int b17 = i65.a.b(view.getContext(), 1);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i) {
                outRect.left = 0;
                outRect.right = 0;
                outRect.bottom = 0;
                outRect.top = 0;
                return;
            }
            int i17 = b17 / 2;
            outRect.left = i17;
            outRect.right = i17;
            outRect.bottom = i17;
            outRect.top = i17;
            return;
        }
        int dimension = (int) (pj0Var.f127380f == 2 ? view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl) : view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        int dimension2 = (int) (pj0Var.f127380f == 2 ? view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj) : view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams2).f11941i) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams3).e() % 2 == 0) {
            outRect.left = dimension;
            outRect.right = dimension2;
            outRect.bottom = dimension2;
            outRect.top = dimension2;
            return;
        }
        outRect.left = dimension2;
        outRect.right = dimension;
        outRect.bottom = dimension2;
        outRect.top = dimension2;
    }
}
