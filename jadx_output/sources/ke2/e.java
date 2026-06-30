package ke2;

/* loaded from: classes.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306943t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sg1 f306944u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, r45.eq1 info, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(info, "info");
        this.f306943t = "Finder.CgiFinderLiveAnchorOpFanClub";
        r45.sg1 sg1Var = new r45.sg1();
        this.f306944u = sg1Var;
        sg1Var.set(1, db2.t4.f228171a.a(6632));
        sg1Var.set(2, xy2.c.f(qt2Var));
        sg1Var.set(3, java.lang.Integer.valueOf(i17));
        sg1Var.set(4, info);
        B();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tg1 resp = (r45.tg1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306943t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    public final void B() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.sg1 sg1Var = this.f306944u;
        lVar.f70664a = sg1Var;
        r45.tg1 tg1Var = new r45.tg1();
        tg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tg1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tg1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchoropfanclub";
        lVar.f70667d = 6632;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(sg1Var.getString(2));
        sb6.append(',');
        sb6.append(sg1Var.getInteger(3));
        sb6.append(',');
        r45.eq1 eq1Var = (r45.eq1) sg1Var.getCustom(4);
        sb6.append(eq1Var != null ? eq1Var.getString(0) : null);
        com.tencent.mars.xlog.Log.i(this.f306943t, sb6.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, r45.gg1 customGiftInfo, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(customGiftInfo, "customGiftInfo");
        this.f306943t = "Finder.CgiFinderLiveAnchorOpFanClub";
        r45.sg1 sg1Var = new r45.sg1();
        this.f306944u = sg1Var;
        sg1Var.set(1, db2.t4.f228171a.a(6632));
        sg1Var.set(2, xy2.c.f(qt2Var));
        sg1Var.set(3, java.lang.Integer.valueOf(i17));
        sg1Var.set(5, customGiftInfo);
        B();
    }
}
