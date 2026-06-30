package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class t1 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (u07 < (adapter != null ? adapter.getItemCount() : -1)) {
            outRect.top = com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView.f151657i;
        } else {
            outRect.top = 0;
        }
    }
}
