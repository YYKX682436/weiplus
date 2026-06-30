package rq2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.b f398844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f398846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rq2.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398844d = bVar;
        this.f398845e = i17;
        this.f398846f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rq2.n(this.f398844d, this.f398845e, this.f398846f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rq2.n nVar = (rq2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct nearbyLiveSquareReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct();
        rq2.d dVar = rq2.d.f398816a;
        nearbyLiveSquareReportStruct.f59630m = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        nearbyLiveSquareReportStruct.f59631n = nearbyLiveSquareReportStruct.b("networkType", com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        nearbyLiveSquareReportStruct.f59633p = this.f398844d.f398814d;
        nearbyLiveSquareReportStruct.f59632o = this.f398845e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("reddot_type", new java.lang.Integer(this.f398846f ? 2 : 1));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        nearbyLiveSquareReportStruct.f59636s = nearbyLiveSquareReportStruct.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareStateReporter", "reportSquareRedILog：\n " + nearbyLiveSquareReportStruct.n());
        nearbyLiveSquareReportStruct.k();
        return jz5.f0.f302826a;
    }
}
