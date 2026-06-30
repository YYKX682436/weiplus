package db2;

/* loaded from: classes2.dex */
public final class q0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String activityId, java.lang.String str, byte[] bArr, long j17, long j18, java.lang.String str2, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        java.lang.String finderUsername = (i18 & 2) != 0 ? "" : str;
        byte[] bArr2 = (i18 & 4) != 0 ? null : bArr;
        long j19 = (i18 & 8) != 0 ? 0L : j17;
        long j27 = (i18 & 16) == 0 ? j18 : 0L;
        java.lang.String noticeId = (i18 & 32) == 0 ? str2 : "";
        boolean z18 = (i18 & 128) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(activityId, "activityId");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        r45.yr1 yr1Var = new r45.yr1();
        yr1Var.set(1, db2.t4.f228171a.a(10635));
        yr1Var.set(2, activityId);
        yr1Var.set(4, java.lang.Long.valueOf(j19));
        yr1Var.set(5, com.tencent.mm.protobuf.g.b(bArr2));
        yr1Var.set(3, java.lang.Long.valueOf(j27));
        yr1Var.set(6, noticeId);
        yr1Var.set(7, java.lang.Integer.valueOf(i17));
        yr1Var.set(8, finderUsername);
        yr1Var.set(9, java.lang.Boolean.valueOf(z18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yr1Var;
        r45.zr1 zr1Var = new r45.zr1();
        zr1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zr1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zr1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetconcertticket";
        lVar.f70667d = 10635;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zr1 resp = (r45.zr1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
    }
}
