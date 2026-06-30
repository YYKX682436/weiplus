package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class ec0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f134263a;

    public ec0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        this.f134263a = nc0Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f134263a;
        nc0Var.f135320r = true;
        ((com.tencent.mm.plugin.ringtone.uic.d2) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Bi(nc0Var.getActivity())).Q6(false);
        return true;
    }
}
