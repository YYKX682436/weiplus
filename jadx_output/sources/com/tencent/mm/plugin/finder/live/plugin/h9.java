package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h9 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f112789d;

    public h9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        this.f112789d = o9Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        xh2.c cVar = (xh2.c) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "micCoverDataChangeEvent: " + cVar.f454531a);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.g9(this.f112789d, cVar));
    }
}
