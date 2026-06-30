package db2;

/* loaded from: classes3.dex */
public final class j5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228031g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228032h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228033i;

    public /* synthetic */ j5(int i17, java.util.List list, long j17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, r45.i3 i3Var, r45.qt2 qt2Var, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, list, j17, str, i18, str2, str3, (i19 & 128) != 0 ? r45.i3.AdFeedbackBusinessType_AdComment : i3Var, (i19 & 256) != 0 ? null : qt2Var);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228031g, "NetSceneFinderAdFeedback onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.tencent.mm.modelbase.u0 u0Var = this.f228033i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228033i = u0Var;
        com.tencent.mars.xlog.Log.i(this.f228031g, "NetSceneFinderAdFeedback doScene");
        return dispatch(sVar, this.f228032h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8432;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(int i17, java.util.List reasonIdList, long j17, java.lang.String str, int i18, java.lang.String reportExtraData, java.lang.String bypassData, r45.i3 businessType, r45.qt2 qt2Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(reasonIdList, "reasonIdList");
        kotlin.jvm.internal.o.g(reportExtraData, "reportExtraData");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        this.f228031g = "Finder.NetSceneFinderAdFeedback";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8432;
        r45.pt0 pt0Var = new r45.pt0();
        pt0Var.set(2, new java.util.LinkedList(reasonIdList));
        pt0Var.set(3, reportExtraData);
        pt0Var.set(4, bypassData);
        db2.t4 t4Var = db2.t4.f228171a;
        pt0Var.set(1, t4Var.b(8432, qt2Var));
        pt0Var.set(5, java.lang.Integer.valueOf(i17));
        pt0Var.set(6, java.lang.Integer.valueOf(businessType.f376696d));
        t4Var.h((r45.kv0) pt0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = pt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f70665b = mt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadfeedback";
        this.f228032h = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderAdFeedback", "NetSceneFinderAdFeedback adFeedbackType=" + i17 + ", reasonList=[" + kz5.n0.g0(reasonIdList, null, null, null, 0, null, db2.i5.f228017d, 31, null) + ']');
    }
}
