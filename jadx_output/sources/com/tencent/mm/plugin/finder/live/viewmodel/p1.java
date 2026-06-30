package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class p1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s1 f117313d;

    public p1(com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var) {
        this.f117313d = s1Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var = this.f117313d;
        if (u07 < 4) {
            outRect.top = s1Var.f117373e;
        } else {
            outRect.top = s1Var.f117374f;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        float f17 = s1Var.f117375g;
        int i17 = ((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams).f11865h;
        float f18 = 4;
        outRect.left = (int) ((i17 * f17) / f18);
        outRect.right = (int) ((f17 * (3.0f - i17)) / f18);
    }
}
