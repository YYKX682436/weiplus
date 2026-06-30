package kq3;

@j95.b
/* loaded from: classes12.dex */
public final class e extends i95.w implements bx1.s {
    public void Ai(long j17, java.lang.String fromUser, boolean z17, long j18) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct preloadClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct();
        preloadClientReportStruct.f59850d = 3L;
        preloadClientReportStruct.f59851e = 4L;
        preloadClientReportStruct.p(fromUser);
        preloadClientReportStruct.q(java.lang.String.valueOf(j17));
        preloadClientReportStruct.f59855i = 1L;
        preloadClientReportStruct.f59859m = j18 / 1000;
        preloadClientReportStruct.f59858l = z17 ? 2L : 1L;
        if (oq3.k.f347394a.c(4, fromUser) != 0) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            sq3.a Y6 = nVar.A.Y6(j17 + "_4");
            if (Y6 != null && Y6.J0() != Y6.z0()) {
                preloadClientReportStruct.f59855i = 2L;
                preloadClientReportStruct.f59858l = 2L;
            }
        }
        java.lang.String m17 = preloadClientReportStruct.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C file receive:%s", m17);
        jx3.f.INSTANCE.kvStat(27004, m17);
    }

    public void Bi(long j17, long j18, java.lang.String fromUser, long j19, long j27, long j28, long j29) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct preloadClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct();
        preloadClientReportStruct.f59850d = 12L;
        preloadClientReportStruct.f59851e = j17;
        preloadClientReportStruct.p(fromUser);
        preloadClientReportStruct.q(java.lang.String.valueOf(j18));
        preloadClientReportStruct.f59856j = j19;
        preloadClientReportStruct.f59857k = j27;
        preloadClientReportStruct.f59859m = j29 / 1000;
        preloadClientReportStruct.f59860n = j28;
        java.lang.String m17 = preloadClientReportStruct.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C msg pre download end:%s", m17);
        jx3.f.INSTANCE.kvStat(27004, m17);
    }

    public void Di(long j17, long j18, java.lang.String fromUser, long j19, long j27, long j28, long j29) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct preloadClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct();
        preloadClientReportStruct.f59850d = 11L;
        preloadClientReportStruct.f59851e = j17;
        preloadClientReportStruct.p(fromUser);
        preloadClientReportStruct.q(java.lang.String.valueOf(j18));
        preloadClientReportStruct.f59856j = j19;
        preloadClientReportStruct.f59857k = j27;
        preloadClientReportStruct.f59859m = j29 / 1000;
        preloadClientReportStruct.f59860n = j28;
        java.lang.String m17 = preloadClientReportStruct.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 c2c msg pre download start:%s", m17);
        jx3.f.INSTANCE.kvStat(27004, m17);
    }

    public void wi(long j17, java.lang.String fromUser, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct preloadClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct();
        preloadClientReportStruct.f59850d = 1L;
        preloadClientReportStruct.f59851e = 4L;
        preloadClientReportStruct.p(fromUser);
        preloadClientReportStruct.q(java.lang.String.valueOf(j17));
        preloadClientReportStruct.f59855i = j18;
        preloadClientReportStruct.f59858l = j19;
        preloadClientReportStruct.f59859m = j27 / 1000;
        java.lang.String m17 = preloadClientReportStruct.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C file click:%s", m17);
        jx3.f.INSTANCE.kvStat(27004, m17);
    }
}
