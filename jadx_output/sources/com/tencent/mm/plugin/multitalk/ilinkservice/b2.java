package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c2 f149511d;

    public b2(com.tencent.mm.plugin.multitalk.ilinkservice.c2 c2Var, int i17) {
        this.f149511d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c2 c2Var = this.f149511d;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = c2Var.f149531a;
        boolean z17 = i4Var.f149632k2;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = c2Var.f149531a;
        if (z17) {
            i4Var.Y();
        } else {
            i4Var.f149635m.postDelayed(new com.tencent.mm.plugin.multitalk.ilinkservice.h4(i4Var.f149644p2), 1000L);
            i4Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "It should launch timer about uninit engine! isUninitEngineWhenCallEnd %b, mIsNotSendBanner %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(i4Var2.f149632k2));
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var2.Y;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onCallEndMultiTalk");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.j(cVar));
        if (i4Var2.f149637n != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: current not in room");
            i4Var2.getClass();
            i4Var2.f149637n = 0;
            i4Var2.S = false;
            return;
        }
        i4Var2.getClass();
        i4Var2.f149659z1 = false;
        i4Var2.A1 = false;
        i4Var2.f149637n = 0;
        i4Var2.S = false;
    }
}
