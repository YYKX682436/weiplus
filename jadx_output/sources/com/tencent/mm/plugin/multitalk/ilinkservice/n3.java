package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149732d;

    public n3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149732d = i4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149732d;
        if (i4Var.f149642p0) {
            return;
        }
        i4Var.f149642p0 = true;
        i4Var.f149653x0 = 0;
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SwitchAV(i4Var.T1 ? 1 : 0, 1, 0);
    }
}
