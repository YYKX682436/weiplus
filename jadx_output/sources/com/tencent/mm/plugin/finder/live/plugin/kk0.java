package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class kk0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113265d;

    public kk0(android.view.ViewGroup viewGroup) {
        this.f113265d = viewGroup;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        outRect.bottom = this.f113265d.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
    }
}
