package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176913d;

    public x0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176913d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176913d;
        int i17 = g1Var.W + 1;
        g1Var.W = i17;
        if (g1Var.f176532x.B1 != 0 || i17 > 10) {
            g1Var.n();
            wu5.c cVar = g1Var.V;
            if (cVar != null) {
                cVar.cancel(false);
                g1Var.V = null;
            }
        }
    }
}
