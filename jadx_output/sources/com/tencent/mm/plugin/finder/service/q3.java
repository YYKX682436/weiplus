package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class q3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f126182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f126183b;

    public q3(yz5.r rVar, android.content.Context context) {
        this.f126182a = rVar;
        this.f126183b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        android.content.Context context = this.f126183b;
        yz5.r rVar = this.f126182a;
        boolean z17 = true;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.t81 t81Var = (r45.t81) fVar.f70618d;
            r45.vi2 vi2Var = (t81Var == null || (list = t81Var.getList(1)) == null) ? null : (r45.vi2) list.getFirst();
            if (vi2Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.SessionInfoService", "sessionId:" + vi2Var.getString(1) + " , reject:" + vi2Var.getInteger(2) + ", enableAction:" + vi2Var.getInteger(3) + ", followFlag:" + vi2Var.getInteger(5) + "  disable_sendmsg_need_follow:" + vi2Var.getBoolean(6));
                com.tencent.mm.plugin.finder.storage.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
                java.lang.String string = vi2Var.getString(1);
                if (string == null) {
                    string = "";
                }
                pk6.W0(string, vi2Var.getInteger(2), vi2Var.getInteger(3), vi2Var.getInteger(5), vi2Var.getBoolean(6));
                rVar.C(java.lang.Boolean.valueOf(vi2Var.getBoolean(6)), java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
            } else {
                rVar.C(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), context.getString(com.tencent.mm.R.string.f493408k22));
            }
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f70616b);
            java.lang.String str = fVar.f70617c;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            rVar.C(bool, valueOf, valueOf2, z17 ? context.getString(com.tencent.mm.R.string.f493408k22) : fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
