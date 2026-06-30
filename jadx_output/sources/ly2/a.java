package ly2;

/* loaded from: classes.dex */
public final class a extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, java.lang.String objectNonceId, java.util.List choiceId, java.lang.String votingId, byte[] bArr) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(choiceId, "choiceId");
        kotlin.jvm.internal.o.g(votingId, "votingId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.bl1 bl1Var = new r45.bl1();
        bl1Var.set(1, db2.t4.f228171a.a(7984));
        bl1Var.set(2, java.lang.Long.valueOf(j17));
        bl1Var.set(3, java.lang.Long.valueOf(j18));
        bl1Var.set(4, objectNonceId);
        if (bArr != null) {
            bl1Var.set(7, com.tencent.mm.protobuf.g.b(bArr));
        }
        bl1Var.getList(5).addAll(choiceId);
        bl1Var.set(6, votingId);
        lVar.f70664a = bl1Var;
        r45.cl1 cl1Var = new r45.cl1();
        cl1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cl1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = cl1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveattendvoting";
        lVar.f70667d = 7984;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] feedId=" + j18 + " liveId=" + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.cl1 resp = (r45.cl1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
