package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112569d;

    public fm(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112569d = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112569d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) kz5.n0.a0(hmVar.D1, 0);
        if (wxRecyclerView != null) {
            com.tencent.mm.plugin.finder.live.plugin.hm.x1(hmVar, wxRecyclerView, 0);
        }
    }
}
