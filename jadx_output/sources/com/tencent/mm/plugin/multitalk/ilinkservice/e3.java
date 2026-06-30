package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149565d;

    public e3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149565d = i4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149565d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "danial mSelfReleaseRunnable mCurrentStatus%d mIsJoiningRoom %b", java.lang.Integer.valueOf(i4Var.f149637n), java.lang.Boolean.valueOf(i4Var.S));
        if (i4Var.f149637n != 0 || i4Var.S) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: still not join room in %d ms. directly release", 180000L);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.m(i4Var, true);
    }
}
