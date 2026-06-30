package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.g1 f158939d;

    public j1(com.tencent.mm.plugin.scanner.model.g1 g1Var) {
        this.f158939d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.model.n1 n1Var = com.tencent.mm.plugin.scanner.model.n1.f158959a;
        com.tencent.mm.plugin.scanner.model.g1 g1Var = this.f158939d;
        n1Var.b(g1Var.f158910a, g1Var.f158912c, g1Var.f158913d);
    }
}
