package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.f1 f149898d;

    public c1(com.tencent.mm.plugin.multitalk.model.f1 f1Var) {
        this.f149898d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.n2 c17 = com.tencent.mm.plugin.multitalk.model.o2.c();
        com.tencent.mm.plugin.multitalk.model.f1 f1Var = this.f149898d;
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = f1Var.f149952a;
        com.tencent.mm.plugin.multitalk.model.n2 n2Var = v0Var.E;
        if (c17 == n2Var) {
            v0Var.Z(v0Var.f150165h, v0Var.f150188z1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "network not change: %s", f1Var.f149952a.E.name());
            return;
        }
        v0Var.E = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "steve: network change: %s -> %s", n2Var.name(), f1Var.f149952a.E.name());
        com.tencent.mm.plugin.multitalk.model.v0 v0Var2 = f1Var.f149952a;
        v0Var2.Z(v0Var2.f150165h, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
        com.tencent.mm.plugin.multitalk.model.v0 v0Var3 = f1Var.f149952a;
        com.tencent.mm.plugin.multitalk.model.z zVar = v0Var3.C;
        if (zVar != null) {
            zVar.i1(n2Var, v0Var3.E);
        }
    }
}
