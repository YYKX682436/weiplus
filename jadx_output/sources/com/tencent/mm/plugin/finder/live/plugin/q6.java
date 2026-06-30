package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f113963d;

    public q6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var) {
        this.f113963d = v6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.j0 j0Var = (mm2.j0) obj;
        java.lang.Object[] objArr = j0Var != null && j0Var.f329152b;
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f113963d;
        if (objArr != true) {
            ((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f329472e = 0;
            com.tencent.mm.plugin.finder.live.plugin.v6.t1(v6Var, ((mm2.l0) v6Var.P0(mm2.l0.class)).f329215q);
        } else {
            ((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f329472e = 2;
            java.util.LinkedList list = j0Var.f329151a.getList(0);
            r45.nn1 nn1Var = j0Var.f329151a;
            com.tencent.mm.plugin.finder.live.plugin.v6.t1(v6Var, new mm2.i0(list, nn1Var.getString(1), nn1Var.getBoolean(2) ? 1 : 0));
        }
    }
}
