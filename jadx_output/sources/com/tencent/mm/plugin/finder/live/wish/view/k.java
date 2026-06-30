package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class k extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120636c;

    public k(com.tencent.mm.plugin.finder.live.wish.view.x xVar) {
        this.f120636c = xVar;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f120636c.f120665b;
        kotlin.jvm.internal.o.d(wxRecyclerAdapter);
        int itemViewType = wxRecyclerAdapter.getItemViewType(i17);
        return (itemViewType == 2 || itemViewType == 3 || itemViewType == 4) ? 3 : 1;
    }
}
