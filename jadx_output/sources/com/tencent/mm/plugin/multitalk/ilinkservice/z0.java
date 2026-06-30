package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.a1 f149866d;

    public z0(com.tencent.mm.plugin.multitalk.ilinkservice.a1 a1Var) {
        this.f149866d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.a1 a1Var = this.f149866d;
        java.util.Map map = a1Var.f149506a.f149634l2;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = a1Var.f149506a;
        if (map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f149634l2).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "accept call timeout");
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var.Y;
        cVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.e(cVar, i4Var.f149623f));
        i4Var.u();
    }
}
