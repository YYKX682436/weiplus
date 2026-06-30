package uu1;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f431264d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pr1 f431265e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f431266f;

    public a(java.lang.String ticket) {
        kotlin.jvm.internal.o.g(ticket, "ticket");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.or1();
        lVar.f70665b = new r45.pr1();
        lVar.f70667d = 4261;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f431264d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationRequest");
        r45.or1 or1Var = (r45.or1) fVar;
        or1Var.set(6, 3);
        or1Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a));
        or1Var.set(4, ticket);
        setHasCallbackToQueue(true);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "doScene");
        this.f431266f = u0Var;
        return dispatch(sVar, this.f431264d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4261;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.o82 o82Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationResponse");
        this.f431265e = (r45.pr1) fVar;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd error");
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastFailedNetSceneCallbackFailedReport");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 2L, 1L);
        }
        r45.pr1 pr1Var = this.f431265e;
        if (pr1Var == null || (o82Var = (r45.o82) pr1Var.getCustom(2)) == null) {
            return;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f431266f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetScreenCastAuthorization", "response is " + o82Var.getString(0) + " and " + o82Var.getString(1) + " and " + o82Var.getString(2));
        com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastNetSceneCallbackSuccReport");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 3L, 1L);
    }
}
