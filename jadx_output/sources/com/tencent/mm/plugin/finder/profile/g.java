package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class g extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams).f11865h % 2 == 0) {
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
