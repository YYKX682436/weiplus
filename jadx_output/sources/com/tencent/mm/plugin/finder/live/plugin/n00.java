package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f113575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f113576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f113577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f113578g;

    public n00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var, android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f113575d = w00Var;
        this.f113576e = bundle;
        this.f113577f = obj;
        this.f113578g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f113575d;
        if (!w00Var.a1()) {
            dk2.xf W0 = w00Var.W0();
            if (W0 != null) {
                ((dk2.r4) W0).b0(this.f113576e, this.f113577f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(w00Var.f114843q, "goToFinderProfileImpl delayMs:" + this.f113578g + ",isFinished!");
    }
}
