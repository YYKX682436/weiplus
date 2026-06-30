package rq2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jp1 f398832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f22 f398833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f398834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.jp1 jp1Var, r45.f22 f22Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398832d = jp1Var;
        this.f398833e = f22Var;
        this.f398834f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rq2.i(this.f398832d, this.f398833e, this.f398834f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rq2.i iVar = (rq2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rq2.o oVar = rq2.o.f398847a;
        com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct nearbyLiveSquareReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct();
        rq2.d dVar = rq2.d.f398816a;
        nearbyLiveSquareReportStruct.f59630m = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        nearbyLiveSquareReportStruct.f59631n = nearbyLiveSquareReportStruct.b("networkType", com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        rq2.b bVar = rq2.b.f398811e;
        nearbyLiveSquareReportStruct.f59633p = 5;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.jp1 jp1Var = this.f398832d;
        jSONObject.putOpt("loading_time", java.lang.Integer.valueOf(jp1Var.getInteger(1)));
        jSONObject.putOpt("loading_time_from_click", java.lang.Integer.valueOf(jp1Var.getInteger(5)));
        jSONObject.putOpt("enter_type", java.lang.Integer.valueOf(jp1Var.getInteger(2)));
        jSONObject.putOpt("enter_reddot_type", java.lang.Integer.valueOf(jp1Var.getInteger(4)));
        jSONObject.putOpt("status_flag", java.lang.Long.valueOf(this.f398833e.getLong(2)));
        jSONObject.putOpt("isVerticalSquare", java.lang.Integer.valueOf(this.f398834f ? 1 : 0));
        ae2.b2 b2Var = ae2.b2.f3461a;
        jSONObject.putOpt("isOpenSquareTabOp", ((lb2.j) ((jz5.n) ae2.b2.G).getValue()).r());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        nearbyLiveSquareReportStruct.f59636s = nearbyLiveSquareReportStruct.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(nearbyLiveSquareReportStruct);
        nearbyLiveSquareReportStruct.k();
        return jz5.f0.f302826a;
    }
}
