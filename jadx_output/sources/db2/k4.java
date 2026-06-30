package db2;

/* loaded from: classes.dex */
public final class k4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f228042t;

    public k4(long j17) {
        super(null, null, 3, null);
        r45.yu1 yu1Var = new r45.yu1();
        yu1Var.set(1, db2.t4.f228171a.a(8350));
        yu1Var.set(2, java.lang.Long.valueOf(j17));
        yu1Var.set(3, java.lang.Integer.valueOf(te2.sc.f418413b));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yu1Var;
        r45.zu1 zu1Var = new r45.zu1();
        zu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zu1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zu1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetshareqrcode";
        lVar.f70667d = 8350;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f228042t = a17;
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t52 t52Var;
        r45.zu1 resp = (r45.zu1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.modelbase.o oVar = this.f228042t;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetShareQRCodeResponse");
        r45.f92 f92Var = (r45.f92) ((r45.zu1) fVar2).getCustom(1);
        if (f92Var == null || (t52Var = (r45.t52) f92Var.getCustom(6)) == null) {
            return;
        }
        te2.sc.f418412a.c(t52Var.getInteger(2), t52Var.getBoolean(1), t52Var.getList(0));
    }
}
