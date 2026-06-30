package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ia0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f134724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.da f134725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f134726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134727g;

    public ia0(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, cw2.da daVar, long j17, java.lang.String str) {
        this.f134724d = finderVideoRecycler;
        this.f134725e = daVar;
        this.f134726f = j17;
        this.f134727g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = this.f134724d;
        cw2.da daVar = this.f134725e;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.N6(finderVideoRecycler, daVar);
        finderVideoRecycler.f133688x.remove(java.lang.Integer.valueOf(daVar.hashCode()));
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[releaseVideoView] completed! cost=" + (java.lang.System.currentTimeMillis() - this.f134726f) + "ms, release view=" + daVar.hashCode() + " source=" + this.f134727g);
    }
}
