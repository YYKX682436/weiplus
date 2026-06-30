package ek2;

/* loaded from: classes3.dex */
public final class a1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.z0 f253408u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253409v;

    /* renamed from: w, reason: collision with root package name */
    public int f253410w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(int i17, java.lang.String finderUsername, long j17, long j18, byte[] bArr, java.lang.String nonceId, java.lang.String lotteryId, com.tencent.mm.protobuf.g gVar, ek2.z0 z0Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        this.f253408u = z0Var;
        this.f253409v = "CgiFinderLiveGetLotteryRecord";
        r45.gt1 gt1Var = new r45.gt1();
        gt1Var.set(2, finderUsername);
        gt1Var.set(3, java.lang.Long.valueOf(j17));
        gt1Var.set(4, java.lang.Long.valueOf(j18));
        gt1Var.set(5, java.lang.Long.valueOf(pm0.v.Z(nonceId)));
        gt1Var.set(6, lotteryId);
        gt1Var.set(7, gVar);
        gt1Var.set(1, db2.t4.f228171a.a(5258));
        gt1Var.set(8, nonceId);
        gt1Var.set(9, com.tencent.mm.protobuf.g.b(bArr));
        gt1Var.set(10, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = gt1Var;
        r45.ht1 ht1Var = new r45.ht1();
        ht1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ht1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ht1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetlotteryrecord";
        lVar.f70667d = 5258;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveGetLotteryRecord", "init scene:" + gt1Var.getInteger(10) + ",finderUsername:" + gt1Var.getString(2) + ",liveId:" + gt1Var.getLong(3) + ",objectId:" + gt1Var.getLong(4) + ",objectNonceId:" + gt1Var.getString(8) + ",lotteryId:" + gt1Var.getString(6) + ",lastBuffer:" + gt1Var.getByteString(7) + ",live_cookies:" + gt1Var.getByteString(9));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ht1 resp = (r45.ht1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253409v;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "result:" + pm0.b0.g(resp));
        }
        ek2.z0 z0Var = this.f253408u;
        if (z0Var != null) {
            z0Var.a(i17, i18, str, resp);
        }
    }
}
