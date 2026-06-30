package ke2;

/* loaded from: classes.dex */
public final class r extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306985t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(java.lang.String appid, int i17, java.lang.String ticket, int i18, int i19, java.lang.String gameUserId) {
        super(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        kotlin.jvm.internal.o.g(gameUserId, "gameUserId");
        this.f306985t = "Finder.CgiFinderLiveGetAuthorization";
        r45.or1 or1Var = new r45.or1();
        or1Var.set(1, db2.t4.f228171a.a(4261));
        or1Var.set(2, xy2.c.f(this.f16135n));
        or1Var.set(3, wo.w0.k());
        or1Var.set(4, ticket);
        or1Var.set(5, appid);
        or1Var.set(6, java.lang.Integer.valueOf(i17));
        or1Var.set(7, java.lang.Integer.valueOf(i18));
        or1Var.set(8, java.lang.Integer.valueOf(i19));
        or1Var.set(9, gameUserId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = or1Var;
        r45.pr1 pr1Var = new r45.pr1();
        pr1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pr1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pr1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        lVar.f70667d = 4261;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetAuthorization", "init " + appid + ", " + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pr1 resp = (r45.pr1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306985t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
