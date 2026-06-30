package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.a2 f149867d;

    public z1(com.tencent.mm.plugin.multitalk.ilinkservice.a2 a2Var) {
        this.f149867d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149867d.f149507a;
        if (i4Var.f149639o != com.tencent.mm.plugin.multitalk.ilinkservice.c4.ReasonManual) {
            i4Var.f149639o = com.tencent.mm.plugin.multitalk.ilinkservice.c4.ReasonInterrupted;
        }
        i4Var.V = com.tencent.mm.plugin.multitalk.ilinkservice.d4.ILinkErrCallBroken;
        i4Var.Y.c(8, i4Var.f149643p1, null);
    }
}
