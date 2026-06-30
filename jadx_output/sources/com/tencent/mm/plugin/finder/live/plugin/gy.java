package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f112741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f112742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f112743g;

    public gy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f112740d = tyVar;
        this.f112741e = bundle;
        this.f112742f = obj;
        this.f112743g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112740d;
        if (tyVar.a1()) {
            com.tencent.mars.xlog.Log.i(tyVar.f114488q, "goToFinderProfileImpl delayMs:" + this.f112743g + ",isFinished!");
            return;
        }
        dk2.xf W0 = tyVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).b0(this.f112741e, this.f112742f, tyVar.f114490s);
        }
    }
}
