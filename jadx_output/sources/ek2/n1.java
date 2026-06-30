package ek2;

/* loaded from: classes.dex */
public final class n1 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int i17, long j17, long j18, java.lang.String objectNonceId, com.tencent.mm.protobuf.g gVar, int i18, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        gVar = (i18 & 16) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.at1 at1Var = new r45.at1();
        at1Var.set(3, java.lang.Integer.valueOf(i17));
        at1Var.set(1, db2.t4.f228171a.a(6484));
        at1Var.set(2, xy2.c.f(this.f16135n));
        at1Var.set(4, java.lang.Long.valueOf(j17));
        at1Var.set(5, java.lang.Long.valueOf(j18));
        at1Var.set(7, gVar);
        at1Var.set(6, objectNonceId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = at1Var;
        r45.bt1 bt1Var = new r45.bt1();
        bt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bt1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bt1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetlotteryhistory";
        lVar.f70667d = 6484;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveLotteryHistory", "CgiFinderLiveLotteryHistory init, finderUsername = " + at1Var.getString(2) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + objectNonceId + ", scene = " + i17 + ",  lastBuffer = " + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bt1 resp = (r45.bt1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveLotteryHistory", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
