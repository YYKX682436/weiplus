package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class o7 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f174147d;

    public o7(kotlin.jvm.internal.e0 e0Var) {
        this.f174147d = e0Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        float f17 = this.f174147d.f310115d;
        outRect.bottom = ((int) f17) / 2;
        outRect.left = ((int) f17) / 2;
        outRect.right = ((int) f17) / 2;
    }
}
