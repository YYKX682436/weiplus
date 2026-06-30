package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g f122069d;

    public f(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar) {
        this.f122069d = gVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        java.util.List data;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = this.f122069d;
        androidx.recyclerview.widget.f2 adapter = gVar.f122079j.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        int u07 = parent.u0(view);
        if (u07 == 0) {
            outRect.left = 0;
        } else {
            outRect.left = i65.a.b(gVar.f122075f, 4);
        }
        if (u07 == data.size() - 1) {
            outRect.right = i65.a.b(gVar.f122075f, 0);
        } else {
            outRect.right = i65.a.b(gVar.f122075f, 4);
        }
    }
}
