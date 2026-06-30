package rq2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.a f398815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rq2.a aVar) {
        super(0);
        this.f398815d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        rq2.d dVar = rq2.d.f398816a;
        com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct nearbyLiveSquareReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct();
        rq2.a aVar = this.f398815d;
        nearbyLiveSquareReportStruct.f59623f = (int) aVar.f398808s;
        nearbyLiveSquareReportStruct.f59621d = (int) aVar.f398805p;
        nearbyLiveSquareReportStruct.f59622e = (int) aVar.f398806q;
        nearbyLiveSquareReportStruct.f59624g = (int) aVar.f398807r;
        nearbyLiveSquareReportStruct.f59632o = aVar.f398800k;
        nearbyLiveSquareReportStruct.f59630m = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        nearbyLiveSquareReportStruct.f59628k = rq2.d.f398819d ? 1 : 0;
        nearbyLiveSquareReportStruct.f59631n = nearbyLiveSquareReportStruct.b("networkType", com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        rq2.b bVar = rq2.b.f398811e;
        nearbyLiveSquareReportStruct.f59633p = 8;
        nearbyLiveSquareReportStruct.f59625h = (int) aVar.f398809t;
        nearbyLiveSquareReportStruct.f59634q = aVar.f398803n;
        nearbyLiveSquareReportStruct.f59635r = nearbyLiveSquareReportStruct.b("tabName", aVar.f398804o, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("isVerticalSquare", java.lang.Integer.valueOf(rq2.d.f398825j ? 1 : 0));
        ae2.b2 b2Var = ae2.b2.f3461a;
        jSONObject.putOpt("isOpenSquareTabOp", ((lb2.j) ((jz5.n) ae2.b2.G).getValue()).r());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        nearbyLiveSquareReportStruct.f59636s = nearbyLiveSquareReportStruct.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (aVar.f398798i - rq2.d.f398824i));
        if ((valueOf.intValue() > 0) == false) {
            valueOf = null;
        }
        nearbyLiveSquareReportStruct.f59637t = valueOf != null ? valueOf.intValue() : 1;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (aVar.f398798i - aVar.f398790a));
        if ((valueOf2.intValue() > 0) == false) {
            valueOf2 = null;
        }
        nearbyLiveSquareReportStruct.f59638u = valueOf2 != null ? valueOf2.intValue() : 1;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf((int) (aVar.f398798i - aVar.f398790a));
        java.lang.Integer num = (valueOf3.intValue() > 0) == true ? valueOf3 : null;
        nearbyLiveSquareReportStruct.f59639v = num != null ? num.intValue() : 1;
        nearbyLiveSquareReportStruct.f59640w = aVar.f398802m;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        ae2.in inVar = ae2.in.f3688a;
        jSONObject3.put("isOpenSquareTouchPreload", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3720d1).getValue()).r()).intValue());
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        nearbyLiveSquareReportStruct.f59641x = nearbyLiveSquareReportStruct.b("exptJson", r26.i0.t(jSONObject4, ",", ";", false), true);
        nearbyLiveSquareReportStruct.f59642y = aVar.f398801l;
        nearbyLiveSquareReportStruct.f59643z = aVar.f398794e;
        if (rq2.d.f398820e) {
            nearbyLiveSquareReportStruct.f59628k = 2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report24459: ");
        java.lang.String n17 = nearbyLiveSquareReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        sb6.append(" ，isFromRedClick = ");
        sb6.append(rq2.d.f398820e);
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", sb6.toString());
        nearbyLiveSquareReportStruct.k();
        return jz5.f0.f302826a;
    }
}
