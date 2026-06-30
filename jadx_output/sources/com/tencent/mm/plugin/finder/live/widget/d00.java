package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118035a;

    public d00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f118035a = m10Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118035a;
        m10Var.P = false;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            boolean z17 = ((r45.ps1) fVar.f70618d).getBoolean(3);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
            ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
            ((mm2.c1) lVar.P0(mm2.c1.class)).o9(z17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(5)) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            if (fr1Var != null) {
                com.tencent.mm.plugin.finder.live.widget.m10.a(m10Var, fr1Var);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            android.view.ViewGroup viewGroup = m10Var.f118999a;
            db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.dgq), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
