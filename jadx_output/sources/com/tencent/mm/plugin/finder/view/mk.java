package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class mk extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132667d;

    public mk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        this.f132667d = finderSnsHeaderView;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480419xe);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = this.f132667d.getRecyclerView().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (u07 == 0) {
            outRect.left = dimension;
            outRect.right = dimension2;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        if (u07 == itemCount - 1) {
            outRect.left = dimension2;
            outRect.right = dimension;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        outRect.left = dimension2;
        outRect.right = dimension2;
        outRect.bottom = 0;
        outRect.top = 0;
    }
}
