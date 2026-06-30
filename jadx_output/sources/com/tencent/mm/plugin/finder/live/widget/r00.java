package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class r00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f119565a;

    public r00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f119565a = m10Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.q63 q63Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f119565a;
            boolean z17 = ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).P2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume ");
            sb6.append(z17);
            sb6.append(' ');
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            if (fr1Var == null) {
                fr1Var = new r45.fr1();
            }
            sb6.append(pm0.b0.g(fr1Var));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            r45.fr1 fr1Var2 = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            if (fr1Var2 != null && (q63Var = (r45.q63) fr1Var2.getCustom(7)) != null && kotlin.jvm.internal.o.b(q63Var.getString(1), m10Var.L) && q63Var.getInteger(2) > 0 && q63Var.getInteger(3) == 0 && z17) {
                android.view.ViewGroup viewGroup = m10Var.f118999a;
                db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.czb));
            }
            m10Var.L = null;
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorGameTeamWidget", "CgiFinderLiveGetGameTeamInfo failed " + fVar.f70616b + ' ' + fVar.f70615a);
        }
        return jz5.f0.f302826a;
    }
}
