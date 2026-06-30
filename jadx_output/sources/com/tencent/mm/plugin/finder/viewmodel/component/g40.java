package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class g40 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134464d;

    public g40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134464d = f50Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SHOW NEW] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        g92.b bVar = g92.b.f269769e;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134464d;
        m92.b j37 = g92.a.j3(bVar, f50Var.f134338d, false, 2, null);
        com.tencent.mm.plugin.finder.viewmodel.component.f50.Q6(f50Var, (z9Var != null && z9Var.f105327a) && !(j37 != null ? j37.w0() : false) && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true), z9Var);
    }
}
