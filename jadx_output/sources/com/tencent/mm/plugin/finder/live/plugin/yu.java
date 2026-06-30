package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f115233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f115234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f115235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f115236g;

    public yu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f115233d = ivVar;
        this.f115234e = bundle;
        this.f115235f = obj;
        this.f115236g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f115233d;
        if (ivVar.a1()) {
            com.tencent.mars.xlog.Log.i(ivVar.f113016r, "goToFinderProfileImpl delayMs:" + this.f115236g + ",isFinished!");
            return;
        }
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f115234e, this.f115235f, ivVar.f113018t);
        }
    }
}
