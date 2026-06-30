package pt0;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pt0.o f358216a = new pt0.o();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f358217b = jz5.h.b(pt0.n.f358215d);

    public final boolean a(java.lang.String str) {
        java.lang.Object value = ((jz5.n) f358217b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return ((com.tencent.mm.sdk.platformtools.o4) value).getBoolean(str + "_migrated_3", false);
    }

    public final void b(java.lang.String tableName, boolean z17, long j17, java.lang.Long l17, long j18) {
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.IDataCleanService", "setDataCleanResult, tableName " + tableName + ", cleanDone: " + z17 + ", timeCost: " + j17 + ", indexTimeCost: " + l17 + ", cleanCount: " + j18);
        java.lang.Object value = ((jz5.n) f358217b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).putBoolean(tableName.concat("_migrated_3"), z17);
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct.p("db_dataclean_succeed");
            msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct.r(tableName);
            long j19 = 1000;
            msgRefactorReportStruct.f59285n = (int) (j17 / j19);
            if (l17 != null) {
                l17.longValue();
                msgRefactorReportStruct.f59286o = (int) (l17.longValue() / j19);
            }
            msgRefactorReportStruct.f59287p = (int) j18;
            msgRefactorReportStruct.k();
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct2.p("db_dataclean_failed");
        msgRefactorReportStruct2.q(com.tencent.mm.sdk.platformtools.z.f193109e);
        msgRefactorReportStruct2.r(tableName);
        long j27 = 1000;
        msgRefactorReportStruct2.f59285n = (int) (j17 / j27);
        if (l17 != null) {
            l17.longValue();
            msgRefactorReportStruct2.f59286o = (int) (l17.longValue() / j27);
        }
        msgRefactorReportStruct2.f59287p = (int) j18;
        msgRefactorReportStruct2.k();
    }
}
