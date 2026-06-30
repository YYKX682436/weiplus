package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes2.dex */
public final class a4 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f139025d;

    /* renamed from: e, reason: collision with root package name */
    public final int f139026e;

    public a4(int i17) {
        this.f139025d = i17;
        this.f139026e = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) parent.getLayoutManager();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        kotlin.jvm.internal.o.d(gridLayoutManager);
        int i17 = gridLayoutManager.f11861w;
        parent.u0(view);
        int i18 = ((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams).f11865h;
        int i19 = i17 - 1;
        int i27 = this.f139025d * i19;
        int i28 = this.f139026e;
        int i29 = (i27 + (i28 * 2)) / i17;
        int i37 = ((i18 * ((i29 - i28) - i28)) / i19) + i28;
        outRect.set(i37, 0, i29 - i37, 0);
    }
}
