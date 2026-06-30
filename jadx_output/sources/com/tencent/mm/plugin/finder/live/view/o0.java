package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class o0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f116551d;

    public o0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f116551d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view) % 2;
        outRect.bottom = this.f116551d;
    }
}
