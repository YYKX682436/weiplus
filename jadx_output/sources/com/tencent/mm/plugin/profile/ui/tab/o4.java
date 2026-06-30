package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes2.dex */
public final class o4 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.bottom = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        outRect.right = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
    }
}
