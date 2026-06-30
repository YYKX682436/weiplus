package f95;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f95.e f260536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f260537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f260538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f95.a f260539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260540h;

    public b(f95.e eVar, int i17, long j17, f95.a aVar, java.lang.String str) {
        this.f260536d = eVar;
        this.f260537e = i17;
        this.f260538f = j17;
        this.f260539g = aVar;
        this.f260540h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f260536d.getClass();
        int i17 = this.f260537e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        long j17 = this.f260538f;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        f95.a aVar = this.f260539g;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(aVar.f260534b);
        java.lang.String str = aVar.f260533a;
        java.lang.String str2 = this.f260540h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MessageTableSQLTracer", "Message SQL Executed, type:%d, time:%d, isMainThread:%b, sql:%s, stack:%s", valueOf, valueOf2, valueOf3, str, str2);
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct.p("msg_sql_trace");
        msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
        msgRefactorReportStruct.u(str2);
        msgRefactorReportStruct.r(r26.i0.u(aVar.f260533a, ',', ' ', false, 4, null));
        msgRefactorReportStruct.f59285n = i17;
        msgRefactorReportStruct.f59286o = (int) j17;
        msgRefactorReportStruct.f59287p = aVar.f260534b ? 1 : 0;
        msgRefactorReportStruct.k();
    }
}
