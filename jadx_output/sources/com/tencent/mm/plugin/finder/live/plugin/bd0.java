package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bd0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f112017e;

    public bd0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, long j17) {
        this.f112016d = nd0Var;
        this.f112017e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f112016d;
        if (!nd0Var.a1()) {
            nd0Var.A1();
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "goToFinderProfileImpl delayMs:" + this.f112017e + ",isFinished!");
    }
}
