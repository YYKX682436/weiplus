package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f113868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f113869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f113870g;

    public pf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f113867d = mgVar;
        this.f113868e = bundle;
        this.f113869f = obj;
        this.f113870g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113867d;
        if (mgVar.a1()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "goToFinderProfileImpl delayMs:" + this.f113870g + ",isFinished!");
            return;
        }
        dk2.xf W0 = mgVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f113868e, this.f113869f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
        }
    }
}
