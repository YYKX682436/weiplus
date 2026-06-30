package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f113947d;

    public q1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, int i17) {
        this.f113947d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int u07 = parent.u0(view);
            int i17 = itemCount % 3 == 0 ? itemCount / 3 : (itemCount / 3) + 1;
            if (i17 <= 1) {
                outRect.bottom = 0;
            } else if (u07 >= (i17 - 1) * 3) {
                outRect.bottom = 0;
            } else {
                outRect.bottom = this.f113947d;
            }
        }
    }
}
