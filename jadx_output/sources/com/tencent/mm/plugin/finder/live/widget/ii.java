package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class ii extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118675d;

    public ii(android.content.Context context) {
        this.f118675d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.bottom = this.f118675d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
    }
}
