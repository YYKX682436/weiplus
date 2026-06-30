package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176792d;

    public r2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176792d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176792d;
        d3Var.g(2);
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        g1Var.H();
        g1Var.U.post(new com.tencent.mm.plugin.voip.model.r0(g1Var));
    }
}
