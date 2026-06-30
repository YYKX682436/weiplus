package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes12.dex */
public final class ay extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f117801d;

    public ay(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget, int i17) {
        this.f117801d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.bottom = this.f117801d;
    }
}
