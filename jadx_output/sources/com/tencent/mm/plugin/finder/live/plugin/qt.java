package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qt implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.rt f114048d;

    public qt(com.tencent.mm.plugin.finder.live.plugin.rt rtVar) {
        this.f114048d = rtVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.util.List<hk2.m> data;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        hk2.m mVar = (hk2.m) holder.f293125i;
        mVar.f281909e = true;
        ((mm2.j2) this.f114048d.f114185d.P0(mm2.j2.class)).Z6(mVar.f281908d);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        for (hk2.m mVar2 : data) {
            if (!kotlin.jvm.internal.o.b(mVar2, mVar)) {
                mVar2.f281909e = false;
            }
        }
        adapter.notifyItemRangeChanged(0, data.size(), 1);
    }
}
