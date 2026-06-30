package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ko extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.lo f118849d;

    public ko(com.tencent.mm.plugin.finder.live.widget.lo loVar) {
        this.f118849d = loVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.finder.live.widget.lo loVar = this.f118849d;
        int size = loVar.f118966j.size();
        if (size == 1) {
            outRect.left = (loVar.f118959c - loVar.f118961e) / 2;
            return;
        }
        if (size == 2) {
            if (u07 == 0) {
                outRect.left = loVar.f118962f;
                outRect.right = loVar.f118960d;
                return;
            }
            return;
        }
        if (u07 == 0) {
            outRect.left = loVar.f118958b + loVar.f118963g;
        } else {
            outRect.left = loVar.f118958b;
        }
        if (u07 == loVar.f118966j.size() - 1) {
            outRect.right = loVar.f118958b;
        }
    }
}
