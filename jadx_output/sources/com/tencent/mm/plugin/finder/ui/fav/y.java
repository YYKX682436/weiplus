package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class y extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        outRect.left = dimension;
        outRect.right = dimension;
        outRect.bottom = 0;
        if (u07 == 0) {
            outRect.top = dimension + ((int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        } else {
            outRect.top = dimension;
        }
    }
}
