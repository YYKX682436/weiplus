package ek2;

/* loaded from: classes10.dex */
public final class s0 extends ek2.g0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f253530v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253531u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ek2.t0 params) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(params, "params");
        this.f253531u = "CgiFinderLiveCreateLottery";
        r45.fo1 fo1Var = new r45.fo1();
        fo1Var.set(2, java.lang.Long.valueOf(params.f253533a));
        fo1Var.set(3, java.lang.Long.valueOf(params.f253534b));
        java.lang.String str = params.f253535c;
        fo1Var.set(4, java.lang.Long.valueOf(pm0.v.Z(str)));
        fo1Var.set(5, java.lang.Integer.valueOf(params.f253536d));
        fo1Var.set(6, params.f253537e);
        r45.xy1 xy1Var = new r45.xy1();
        xy1Var.set(0, java.lang.Integer.valueOf(params.f253538f));
        xy1Var.set(1, params.f253539g);
        xy1Var.set(3, params.f253547o);
        fo1Var.set(7, xy1Var);
        fo1Var.set(8, java.lang.Integer.valueOf(params.f253541i));
        fo1Var.set(9, java.lang.Integer.valueOf(params.f253540h));
        r45.kv0 a17 = db2.t4.f228171a.a(6645);
        if (zl2.r4.f473950a.w1()) {
            a17.set(6, 3);
        }
        fo1Var.set(1, a17);
        fo1Var.set(10, str);
        fo1Var.set(11, java.lang.Long.valueOf(params.f253542j));
        fo1Var.set(12, params.f253543k);
        fo1Var.set(13, params.f253544l);
        fo1Var.set(14, java.lang.Integer.valueOf(params.f253545m));
        fo1Var.set(15, params.f253546n);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fo1Var;
        r45.go1 go1Var = new r45.go1();
        go1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) go1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = go1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivecreatelottery";
        lVar.f70667d = 6645;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveLottery,init liveId:");
        sb6.append(fo1Var.getLong(2));
        sb6.append(",objectId:");
        sb6.append(fo1Var.getLong(3));
        sb6.append(",nonceId:");
        sb6.append(fo1Var.getString(10));
        sb6.append(",lotteryDuration:");
        sb6.append(fo1Var.getInteger(5));
        sb6.append(",lotteryDescription:");
        sb6.append(fo1Var.getString(6));
        sb6.append(",lotteryAttendType:");
        r45.xy1 xy1Var2 = (r45.xy1) fo1Var.getCustom(7);
        sb6.append(xy1Var2 != null ? java.lang.Integer.valueOf(xy1Var2.getInteger(0)) : null);
        sb6.append(",attendWording:");
        r45.xy1 xy1Var3 = (r45.xy1) fo1Var.getCustom(7);
        sb6.append(xy1Var3 != null ? xy1Var3.getString(1) : null);
        sb6.append(",lotteryWinnerCnt:");
        sb6.append(fo1Var.getInteger(8));
        sb6.append(",opType:");
        sb6.append(fo1Var.getInteger(9));
        sb6.append(",setting_flag:");
        sb6.append(fo1Var.getLong(11));
        sb6.append(",claim_method:");
        r45.yy1 yy1Var = (r45.yy1) fo1Var.getCustom(13);
        sb6.append(yy1Var != null ? java.lang.Integer.valueOf(yy1Var.getInteger(0)) : null);
        sb6.append('-');
        r45.yy1 yy1Var2 = (r45.yy1) fo1Var.getCustom(13);
        sb6.append(yy1Var2 != null ? yy1Var2.getString(1) : null);
        sb6.append(",lottery_method_id:");
        sb6.append(fo1Var.getInteger(14));
        com.tencent.mars.xlog.Log.i("CgiFinderLiveCreateLottery", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.go1 resp = (r45.go1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253531u, "FinderLiveLottery [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ",result:" + pm0.b0.g(resp));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
