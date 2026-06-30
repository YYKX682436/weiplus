package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uy implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f120013b;

    public uy(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        this.f120012a = context;
        this.f120013b = dzVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.q63 q63Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        android.content.Context context = this.f120012a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            java.lang.Integer num = null;
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.getInteger(5)) : null);
            sb6.append(' ');
            if (fr1Var != null && (q63Var = (r45.q63) fr1Var.getCustom(7)) != null) {
                num = java.lang.Integer.valueOf(q63Var.getInteger(4));
            }
            sb6.append(num);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", sb6.toString());
            if (fr1Var != null) {
                r45.q63 q63Var2 = (r45.q63) fr1Var.getCustom(7);
                if ((q63Var2 != null ? q63Var2.getInteger(4) : 0) > 0) {
                    db5.t7.g(context, context.getString(com.tencent.mm.R.string.cza));
                } else {
                    com.tencent.mm.plugin.finder.live.widget.dz.i(this.f120013b);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.dgq), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
