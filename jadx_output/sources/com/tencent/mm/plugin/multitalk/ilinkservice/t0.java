package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.u0 f149793d;

    public t0(com.tencent.mm.plugin.multitalk.ilinkservice.u0 u0Var) {
        this.f149793d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "mRecvInviteOtherDevice notify, dismiss view");
        com.tencent.mm.plugin.multitalk.ilinkservice.u0 u0Var = this.f149793d;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = u0Var.f149827a.f149834e.f149846a;
        i4Var.f149621e.c(12, i4Var.K);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = u0Var.f149827a.f149834e.f149846a;
        i4Var2.f149621e.c(13, i4Var2.L);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var3 = u0Var.f149827a.f149834e.f149846a;
        i4Var3.f149621e.c(17, i4Var3.R);
        u0Var.f149827a.f149834e.f149846a.u();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var4 = u0Var.f149827a.f149834e.f149846a;
        i4Var4.f149637n = 0;
        i4Var4.S = false;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var4.Y;
        java.lang.String str = i4Var4.f149643p1;
        cVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.n(cVar, str));
    }
}
