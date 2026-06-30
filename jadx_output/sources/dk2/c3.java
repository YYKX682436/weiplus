package dk2;

/* loaded from: classes3.dex */
public final class c3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f233275b;

    public c3(dk2.r4 r4Var, r45.hc1 hc1Var) {
        this.f233274a = r4Var;
        this.f233275b = hc1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            dk2.r4 r4Var = this.f233274a;
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328811g6 = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            ((mm2.c1) r4Var.m(mm2.c1.class)).Y8(fr1Var);
            mm2.c1 c1Var = (mm2.c1) r4Var.m(mm2.c1.class);
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            c1Var.f328839l6 = yq1Var != null ? yq1Var.getString(4) : null;
            r45.yq1 yq1Var2 = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            gk2.e eVar = r4Var.f234007b;
            if (yq1Var2 != null) {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinLive 3dInfo, uid: ");
                r45.rb rbVar = (r45.rb) yq1Var2.getCustom(6);
                sb6.append(rbVar != null ? rbVar.getString(0) : null);
                sb6.append(", content: ");
                r45.rb rbVar2 = (r45.rb) yq1Var2.getCustom(6);
                sb6.append(rbVar2 != null ? rbVar2.getString(1) : null);
                sb6.append(", is3DDirecting: ");
                sb6.append(yq1Var2.getBoolean(7));
                sb6.append(", is3DDirector: ");
                sb6.append(yq1Var2.getBoolean(8));
                com.tencent.mars.xlog.Log.i(c1Var2.f328800f, sb6.toString());
                ((mm2.c1) c1Var2.business(mm2.c1.class)).Y2 = yq1Var2.getBoolean(7);
                ((mm2.c1) c1Var2.business(mm2.c1.class)).Z2 = yq1Var2.getBoolean(8);
                ((mm2.c1) c1Var2.business(mm2.c1.class)).f328776a3 = (r45.rb) yq1Var2.getCustom(6);
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).X6(this.f233275b.getInteger(47));
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class)) != null) {
                c4Var.F1();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doCgiToRefresh gameTeamInfo status:");
            sb7.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null);
            sb7.append(", in_teaming_up:");
            sb7.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(5)) : null);
            sb7.append(", toast: ");
            r45.yq1 yq1Var3 = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            sb7.append(yq1Var3 != null ? yq1Var3.getString(4) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
