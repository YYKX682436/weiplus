package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149530d;

    public c1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, int i17) {
        this.f149530d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "Hangup ret:" + com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.Hangup(this.f149530d));
    }
}
