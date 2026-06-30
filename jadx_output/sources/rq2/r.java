package rq2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.q f398878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rq2.q qVar) {
        super(0);
        this.f398878d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rq2.s sVar = rq2.s.f398879a;
        com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct nearbyLiveSquareReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct();
        rq2.q qVar = this.f398878d;
        nearbyLiveSquareReportStruct.f59623f = (int) qVar.f398874o;
        nearbyLiveSquareReportStruct.f59621d = (int) qVar.f398871l;
        nearbyLiveSquareReportStruct.f59622e = (int) qVar.f398872m;
        nearbyLiveSquareReportStruct.f59624g = (int) qVar.f398873n;
        nearbyLiveSquareReportStruct.f59632o = qVar.f398868i;
        nearbyLiveSquareReportStruct.f59630m = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        nearbyLiveSquareReportStruct.f59628k = rq2.s.f398882d ? 1 : 0;
        nearbyLiveSquareReportStruct.f59631n = nearbyLiveSquareReportStruct.b("networkType", com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        nearbyLiveSquareReportStruct.f59633p = 2;
        nearbyLiveSquareReportStruct.f59625h = (int) qVar.f398875p;
        nearbyLiveSquareReportStruct.f59626i = (int) qVar.f398876q;
        nearbyLiveSquareReportStruct.f59629l = rq2.s.f398884f ? 1 : 0;
        nearbyLiveSquareReportStruct.f59627j = (int) rq2.s.f398888j;
        nearbyLiveSquareReportStruct.f59634q = qVar.f398869j;
        nearbyLiveSquareReportStruct.f59635r = nearbyLiveSquareReportStruct.b("tabName", qVar.f398870k, true);
        if (rq2.s.f398883e) {
            nearbyLiveSquareReportStruct.f59628k = 2;
        }
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "reportILog：\n " + nearbyLiveSquareReportStruct.n() + " ，isFromRedClick = " + rq2.s.f398883e);
        nearbyLiveSquareReportStruct.k();
        return jz5.f0.f302826a;
    }
}
