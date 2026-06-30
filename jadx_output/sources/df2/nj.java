package df2;

/* loaded from: classes3.dex */
public final class nj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230862a;

    public nj(df2.oj ojVar) {
        this.f230862a = ojVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            boolean z17 = ((r45.ps1) fVar.f70618d).getBoolean(3);
            df2.oj ojVar = this.f230862a;
            java.lang.String str = ojVar.f230971m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(5)) : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (fr1Var == null) {
                com.tencent.mars.xlog.Log.i(ojVar.f230971m, "resp.game_team_info null");
            } else {
                ((mm2.c1) ojVar.business(mm2.c1.class)).Y8(fr1Var);
                ((mm2.c1) ojVar.business(mm2.c1.class)).o9(z17);
            }
        }
        return jz5.f0.f302826a;
    }
}
