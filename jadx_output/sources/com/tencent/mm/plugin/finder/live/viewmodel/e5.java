package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class e5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f117077d;

    public e5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, int i17) {
        this.f117077d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int i17 = this.f117077d;
        if (u07 == 0) {
            outRect.right = i17 / 2;
            return;
        }
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        boolean z17 = false;
        if (adapter != null && u07 == adapter.getItemCount() - 1) {
            z17 = true;
        }
        if (z17) {
            outRect.left = i17 / 2;
        } else {
            outRect.left = i17 / 2;
            outRect.right = i17 / 2;
        }
    }
}
