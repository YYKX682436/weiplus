package ek2;

/* loaded from: classes.dex */
public final class i0 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, long j17, com.tencent.mm.protobuf.g gVar, java.lang.String finderUserName) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        r45.xk1 xk1Var = new r45.xk1();
        xk1Var.set(1, java.lang.Integer.valueOf(i17));
        xk1Var.set(2, java.lang.Long.valueOf(j17));
        xk1Var.set(3, db2.t4.f228171a.a(4013));
        xk1Var.set(4, gVar);
        xk1Var.set(5, finderUserName);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = xk1Var;
        r45.yk1 yk1Var = new r45.yk1();
        yk1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) yk1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = yk1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveattendlottery";
        lVar.f70667d = 4013;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveAttendLottery", "init " + xk1Var.getInteger(1) + ", " + xk1Var.getLong(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.yk1 resp = (r45.yk1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveAttendLottery", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveAttendLottery", "coupon list result:" + pm0.b0.g(resp));
        }
    }
}
