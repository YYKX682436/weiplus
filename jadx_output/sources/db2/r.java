package db2;

/* loaded from: classes.dex */
public final class r extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String finderUsername, int i17, int i18, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.fu0 fu0Var = new r45.fu0();
        fu0Var.set(1, db2.t4.f228171a.b(14597, qt2Var));
        fu0Var.set(2, finderUsername);
        fu0Var.set(3, java.lang.Integer.valueOf(i17));
        fu0Var.set(4, java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fu0Var;
        r45.gu0 gu0Var = new r45.gu0();
        gu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gu0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = gu0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderapplystorepromotionrights";
        lVar.f70667d = 14597;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderApplyStorePromotionRights", "[init] finderUsername:" + finderUsername + " permissionType:" + i17 + ", operType:" + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gu0 resp = (r45.gu0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderApplyStorePromotionRights", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        g92.b.f269769e.M0(3).l();
    }
}
