package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class el implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112432d;

    public el(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112432d = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) this.f112432d.P0(mm2.s2.class)).f329409n;
        if (liveMutableData != null) {
            liveMutableData.postValue(java.lang.Boolean.TRUE);
        }
    }
}
