package db2;

/* loaded from: classes2.dex */
public final class j1 extends az2.j {
    public j1(long j17, long j18) {
        super(null, null, 3, null);
        r45.c91 c91Var = new r45.c91();
        c91Var.set(1, db2.t4.f228171a.b(8577, this.f16135n));
        c91Var.set(2, java.lang.Long.valueOf(j17));
        c91Var.set(3, java.lang.Long.valueOf(j18));
        c91Var.set(4, (r45.gx4) ((jz5.n) kr2.q.f311317h.a().f311325g).getValue());
        r45.d91 d91Var = new r45.d91();
        d91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = c91Var;
        lVar.f70665b = d91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetnpssurvey";
        lVar.f70667d = 8577;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNpsSurvey", "init objectId = " + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d91 resp = (r45.d91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetNpsSurvey", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
