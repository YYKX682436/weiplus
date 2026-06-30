package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149778d;

    public s1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149778d = i4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f149778d.Y.f149514a;
        if (v0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
            if (v0Var.H) {
                com.tencent.mm.plugin.multitalk.model.e3.Di().K();
            }
        }
    }
}
