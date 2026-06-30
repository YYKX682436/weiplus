package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f118388c;

    public g00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, int i17, r45.xq1 xq1Var) {
        this.f118386a = m10Var;
        this.f118387b = i17;
        this.f118388c = xq1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118386a;
        m10Var.f119023y = false;
        int i17 = fVar.f70615a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
            ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
            ((mm2.c1) lVar.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f70618d).getBoolean(3));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(5)) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            if (fr1Var != null) {
                int i18 = this.f118387b;
                if (i18 == 0) {
                    int integer = fr1Var.getInteger(0);
                    if (integer == 1 || integer == 2) {
                        m10Var.u(this.f118388c, fr1Var);
                    }
                } else if (i18 == m10Var.K) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "update gameTeamInfo from show invite");
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveGetGameTeamInfo fail errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
