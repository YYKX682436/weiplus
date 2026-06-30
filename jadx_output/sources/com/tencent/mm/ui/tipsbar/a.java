package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209920d;

    public a(int i17) {
        this.f209920d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = this.f209920d;
    }
}
