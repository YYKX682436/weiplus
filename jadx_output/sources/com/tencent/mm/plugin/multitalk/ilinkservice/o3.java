package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149739d;

    public o3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149739d = i4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149739d;
        if (i4Var.f149642p0) {
            i4Var.f149642p0 = false;
            boolean z17 = i4Var.T1;
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SwitchAV(z17 ? 1 : 0, 0, i4Var.f149653x0);
        }
    }
}
