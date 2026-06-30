package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bk0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dk0 f112045d;

    public bk0(com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var) {
        this.f112045d = dk0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        xh2.c cVar = (xh2.c) obj;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent: " + cVar.f454531a);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ak0(this.f112045d, cVar));
    }
}
