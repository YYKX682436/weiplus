package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class zl extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f115354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f115355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f115356f;

    public zl(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3) {
        this.f115354d = f0Var;
        this.f115355e = f0Var2;
        this.f115356f = f0Var3;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        outRect.left = 0;
        int i17 = this.f115354d.f310116d;
        outRect.right = u07 % i17 == i17 + (-1) ? this.f115355e.f310116d : 0;
        outRect.top = u07 >= i17 ? this.f115356f.f310116d : 0;
        outRect.bottom = 0;
    }
}
