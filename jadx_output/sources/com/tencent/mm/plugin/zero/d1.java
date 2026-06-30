package com.tencent.mm.plugin.zero;

/* loaded from: classes12.dex */
public class d1 implements hm0.t {
    public d1(com.tencent.mm.plugin.zero.m1 m1Var) {
    }

    @Override // hm0.t
    public void b() {
        im0.a.a("onStartupDone", new java.lang.Object[0]);
    }

    @Override // hm0.t
    public void e(boolean z17) {
        if (z17) {
            gm0.k2.a(com.tencent.mm.sdk.platformtools.i.a(), true);
            gm0.k2.b(com.tencent.mm.sdk.platformtools.i.a(), true);
        }
        com.tencent.mars.xlog.Log.appenderFlush();
    }
}
