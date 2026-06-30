package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f149723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149724e;

    public m3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, boolean z17) {
        this.f149724e = i4Var;
        this.f149723d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149724e;
        boolean z17 = i4Var.f149642p0;
        int i17 = i4Var.f149653x0;
        com.tencent.wxmm.v2conference v2conferenceVar = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c;
        boolean z18 = this.f149723d;
        v2conferenceVar.SwitchAV(z18 ? 1 : 0, z17 ? 1 : 0, i17);
    }
}
