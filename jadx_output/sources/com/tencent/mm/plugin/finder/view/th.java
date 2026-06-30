package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class th extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        java.lang.Integer valueOf = adapter != null ? java.lang.Integer.valueOf(adapter.getItemViewType(b17)) : null;
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479648bn);
        outRect.left = dimension;
        outRect.right = dimension;
        outRect.top = 0;
        so2.p6 p6Var = so2.p6.f410541d;
        outRect.bottom = (valueOf == null || valueOf.intValue() != 0) ? dimension * 2 : 0;
    }
}
