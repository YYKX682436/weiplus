package e21;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f246493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f246494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.x f246495g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f246496h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f246497i;

    public c0(xg3.q0 q0Var, e21.e0 e0Var, long j17, e21.x xVar, java.lang.Integer num, int i17) {
        this.f246492d = q0Var;
        this.f246493e = e0Var;
        this.f246494f = j17;
        this.f246495g = xVar;
        this.f246496h = num;
        this.f246497i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f246492d;
        int i17 = q0Var.f454423b;
        e21.e0 e0Var = this.f246493e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) e0Var.f246512b).get(java.lang.Integer.valueOf(i17));
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) e0Var.f246511a).get(java.lang.Integer.valueOf(i17));
        long j17 = q0Var.f454424c;
        long j18 = this.f246494f;
        long j19 = j18 - j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportRemoveFromDBByRemake: reason: ");
        e21.x xVar = this.f246495g;
        sb6.append(xVar);
        sb6.append(" currentTime: ");
        sb6.append(j18);
        sb6.append(" delay: ");
        sb6.append(j19);
        sb6.append("ms op: ");
        sb6.append(e21.a1.a(q0Var));
        sb6.append(", failRecord: ");
        sb6.append(arrayList);
        sb6.append(", failedCountInRecentDown: ");
        sb6.append(this.f246496h);
        sb6.append(", pendingSize:");
        int i18 = this.f246497i;
        sb6.append(i18);
        sb6.append(" source:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", sb6.toString());
        if (xVar != e21.x.f246594d || (((java.lang.Boolean) ((jz5.n) e0Var.f246513c).getValue()).booleanValue() && q0Var.f454424c > 0)) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidOplogReportStruct androidOplogReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidOplogReportStruct();
            androidOplogReportStruct.f55070d = 36L;
            androidOplogReportStruct.f55071e = q0Var.b();
            androidOplogReportStruct.f55072f = xVar.ordinal();
            androidOplogReportStruct.f55076j = i18;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
            sb7.append(arrayList != null ? com.tencent.mm.sdk.platformtools.h2.a(arrayList, ";") : null);
            sb7.append(']');
            androidOplogReportStruct.f55073g = androidOplogReportStruct.b("ResultList", sb7.toString(), true);
            androidOplogReportStruct.f55074h = j19;
            androidOplogReportStruct.f55075i = androidOplogReportStruct.b("FromScene", e21.a1.a(q0Var) + str, true);
            androidOplogReportStruct.k();
        }
        ((ku5.t0) ku5.t0.f312615d).r(new e21.y(q0Var, e0Var), "oplog_reporter_serial_tag");
    }
}
