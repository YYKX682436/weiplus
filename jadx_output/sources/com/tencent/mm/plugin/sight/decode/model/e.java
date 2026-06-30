package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f162423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162424e;

    public e(com.tencent.mm.plugin.sight.decode.model.s sVar, double d17) {
        this.f162424e = sVar;
        this.f162423d = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        double d17 = this.f162423d;
        java.lang.Double valueOf = java.lang.Double.valueOf(d17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "SeekToFrame   %f  %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        this.f162424e.B = d17;
    }
}
