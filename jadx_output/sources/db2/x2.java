package db2;

/* loaded from: classes.dex */
public final class x2 extends az2.j {
    public x2(long j17, long j18) {
        super(null, null, 3, null);
        r45.dw2 dw2Var = new r45.dw2();
        dw2Var.set(1, db2.t4.f228171a.b(8138, this.f16135n));
        dw2Var.set(2, java.lang.Long.valueOf(j17));
        dw2Var.set(3, java.lang.Long.valueOf(j18));
        r45.ew2 ew2Var = new r45.ew2();
        ew2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ew2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = dw2Var;
        lVar.f70665b = ew2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findershownpssurvey";
        lVar.f70667d = 8138;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ew2 resp = (r45.ew2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
    }
}
