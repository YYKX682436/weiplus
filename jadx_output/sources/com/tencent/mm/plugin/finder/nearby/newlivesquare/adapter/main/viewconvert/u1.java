package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class u1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121970d;

    public u1(in5.s0 s0Var) {
        this.f121970d = s0Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 <= 0) {
            u07 = 0;
        }
        in5.s0 s0Var = this.f121970d;
        if (u07 == 0) {
            outRect.left = s0Var.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
        }
        outRect.right = s0Var.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
        outRect.top = s0Var.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        outRect.bottom = s0Var.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
    }
}
