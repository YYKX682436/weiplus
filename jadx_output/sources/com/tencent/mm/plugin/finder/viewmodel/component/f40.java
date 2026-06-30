package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f40 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134330d;

    public f40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134330d = f50Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("noAccount [SHOW NEW] red=");
        boolean z17 = false;
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        if ((z9Var != null && z9Var.f105327a) && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.f50.Q6(this.f134330d, z17, z9Var);
    }
}
