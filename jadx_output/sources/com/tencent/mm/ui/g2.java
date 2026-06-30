package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f208615d;

    public g2(com.tencent.mm.ui.ClearCacheUI clearCacheUI, long j17) {
        this.f208615d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f208615d;
        com.tencent.mars.xlog.Log.w("MicroMsg.ClearCacheUI", "doClearCache flag %d", java.lang.Long.valueOf(j17));
        if ((1 & j17) != 0) {
            com.tencent.mm.vfs.w6.f(tv.a.a());
        }
        if ((2 & j17) != 0) {
            com.tencent.mm.vfs.w6.f(t11.b.f414556a);
        }
        if ((4 & j17) != 0) {
            com.tencent.mm.vfs.w6.f(lp0.b.g0());
        }
        if ((8 & j17) != 0) {
            c01.d9.b().getClass();
            com.tencent.mm.vfs.w6.f(((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi());
        }
        if ((16 & j17) != 0) {
            com.tencent.mm.vfs.w6.f(hn1.a0.a());
        }
        if ((32 & j17) != 0) {
            c01.d9.b().getClass();
            com.tencent.mm.vfs.w6.f(com.tencent.mm.storage.s3.a());
        }
        if ((j17 & 64) != 0) {
            c01.d9.b();
            com.tencent.mm.vfs.w6.f(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi());
        }
        com.tencent.mm.autogen.events.ClearCacheEvent clearCacheEvent = new com.tencent.mm.autogen.events.ClearCacheEvent();
        clearCacheEvent.f54062g.getClass();
        clearCacheEvent.e();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.f2(this));
    }
}
