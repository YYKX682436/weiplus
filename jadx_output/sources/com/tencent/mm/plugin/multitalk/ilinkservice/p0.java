package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.q0 f149740d;

    public p0(com.tencent.mm.plugin.multitalk.ilinkservice.q0 q0Var) {
        this.f149740d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "ack succ, enter view");
        com.tencent.mm.plugin.multitalk.ilinkservice.q0 q0Var = this.f149740d;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = q0Var.f149745a.f149834e.f149846a;
        i4Var.f149621e.c(12, i4Var.K);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = q0Var.f149745a.f149834e.f149846a;
        i4Var2.f149621e.c(13, i4Var2.L);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var3 = q0Var.f149745a.f149834e.f149846a;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var3.Y;
        cVar.f149514a.G(cVar.a(i4Var3.f149623f));
        q0Var.f149745a.f149834e.f149846a.f149637n = 3;
    }
}
