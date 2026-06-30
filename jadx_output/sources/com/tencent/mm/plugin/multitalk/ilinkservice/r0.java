package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s0 f149755d;

    public r0(com.tencent.mm.plugin.multitalk.ilinkservice.s0 s0Var) {
        this.f149755d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recv timeout invite");
        com.tencent.mm.plugin.multitalk.ilinkservice.s0 s0Var = this.f149755d;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = s0Var.f149777a.f149834e.f149846a;
        i4Var.f149621e.c(12, i4Var.K);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = s0Var.f149777a.f149834e.f149846a;
        i4Var2.f149621e.c(13, i4Var2.L);
        s0Var.f149777a.f149834e.f149846a.u();
    }
}
