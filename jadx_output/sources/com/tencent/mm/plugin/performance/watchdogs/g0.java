package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {
    public g0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "trigger memory hook\n(toast for debug/coolassist)", 0).show();
    }
}
