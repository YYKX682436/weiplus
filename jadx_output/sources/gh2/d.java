package gh2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct f271867a;

    /* renamed from: b, reason: collision with root package name */
    public final long f271868b;

    public d(gh2.f fVar, java.lang.String uId, java.lang.String sId) {
        kotlin.jvm.internal.o.g(uId, "uId");
        kotlin.jvm.internal.o.g(sId, "sId");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct finderLiveKTVReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct();
        r45.nw1 nw1Var = ((mm2.e1) fVar.f328963d.a(mm2.e1.class)).f328988r;
        finderLiveKTVReportStruct.f57156f = nw1Var != null ? nw1Var.getLong(0) : 0L;
        finderLiveKTVReportStruct.f57157g = ((mm2.e1) fVar.f328963d.a(mm2.e1.class)).f328983m;
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) fVar.business(mm2.c1.class)).f328852o);
        finderLiveKTVReportStruct.f57158h = finderLiveKTVReportStruct.b("AnchorNickName", b17 != null ? b17.w0() : "", true);
        finderLiveKTVReportStruct.f57159i = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        finderLiveKTVReportStruct.f57155e = finderLiveKTVReportStruct.b("UniqueId", uId, true);
        finderLiveKTVReportStruct.f57154d = finderLiveKTVReportStruct.b("SongId", sId, true);
        this.f271867a = finderLiveKTVReportStruct;
        this.f271868b = java.lang.System.currentTimeMillis();
    }
}
