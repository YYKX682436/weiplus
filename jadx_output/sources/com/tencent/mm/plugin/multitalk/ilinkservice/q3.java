package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149751e;

    public q3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, int i17) {
        this.f149751e = i4Var;
        this.f149750d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149751e;
        int i17 = this.f149750d;
        if (i17 == 101) {
            i4Var.f149653x0 = 1;
            i4Var.f149642p0 = false;
            java.lang.String str = i4Var.f149656y0;
            com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
            com.tencent.mm.plugin.multitalk.ilinkservice.w b17 = c0Var.b(str);
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(i4Var.f149629i.a((int) i4Var.f149633l1, c0Var.f149520d, c0Var.f149524h, c0Var.f149518b, i4Var.f149656y0, b17 != null ? b17.f149841b : null, null), new com.tencent.mm.plugin.multitalk.ilinkservice.p3(this));
            long j17 = c0Var.f149518b;
        } else if (i17 == 102) {
            i4Var.f149653x0 = 2;
            i4Var.f149642p0 = false;
        } else if (i17 != 104) {
            i4Var.f149653x0 = 0;
        } else {
            i4Var.f149653x0 = 0;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SwitchAV(i4Var.T1 ? 1 : 0, i4Var.f149642p0 ? 1 : 0, i4Var.f149653x0);
    }
}
