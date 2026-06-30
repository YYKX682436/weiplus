package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.h f123338d;

    public f(com.tencent.mm.plugin.finder.profile.h hVar) {
        this.f123338d = hVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int b17 = i65.a.b(this.f123338d.f123382a, 1) / 2;
        outRect.left = b17;
        outRect.right = b17;
        outRect.bottom = b17;
        outRect.top = b17;
    }
}
