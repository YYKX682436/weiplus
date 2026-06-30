package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes3.dex */
public final class j extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f173293d;

    public j(int i17) {
        this.f173293d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).f11861w;
        int i18 = u07 % i17;
        int i19 = i17 - 1;
        int i27 = this.f173293d;
        if (i18 == i19) {
            outRect.left = i27 / 2;
        } else {
            outRect.right = i27 / 2;
        }
    }
}
