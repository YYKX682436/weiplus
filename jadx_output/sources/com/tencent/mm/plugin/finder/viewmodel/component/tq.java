package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tq implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f136052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136054f;

    public tq(so2.j5 j5Var, com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var) {
        this.f136052d = j5Var;
        this.f136053e = hsVar;
        this.f136054f = s0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.al2 al2Var = (r45.al2) obj;
        if (al2Var == null) {
            return;
        }
        kr2.q a17 = kr2.q.f311317h.a();
        so2.j5 j5Var = this.f136052d;
        a17.c(al2Var, true, j5Var.getItemId());
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f136053e;
        if (hsVar.f134659o == j5Var.getItemId()) {
            in5.s0 s0Var = this.f136054f;
            hsVar.v7(s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.fs(hsVar, s0Var, 1, true));
        }
    }
}
