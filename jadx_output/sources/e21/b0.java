package e21;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f246487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f246488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f246489g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f246490h;

    public b0(xg3.q0 q0Var, long j17, e21.e0 e0Var, java.lang.Integer num, int i17) {
        this.f246486d = q0Var;
        this.f246487e = j17;
        this.f246488f = e0Var;
        this.f246489g = num;
        this.f246490h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f246486d;
        int i17 = q0Var.f454423b;
        long j17 = q0Var.f454424c;
        long j18 = this.f246487e;
        long j19 = j18 - j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordRemoveFromDB: currentTime: ");
        sb6.append(j18);
        sb6.append(" delay: ");
        sb6.append(j19);
        sb6.append("ms op: ");
        sb6.append(e21.a1.a(q0Var));
        sb6.append(", failRecord: ");
        e21.e0 e0Var = this.f246488f;
        sb6.append(((java.util.LinkedHashMap) e0Var.f246512b).get(java.lang.Integer.valueOf(i17)));
        sb6.append(", failedCountInRecentDown: ");
        sb6.append(this.f246489g);
        sb6.append(", pendingSize:");
        int i18 = this.f246490h;
        sb6.append(i18);
        sb6.append(" source:");
        sb6.append((java.lang.String) ((java.util.LinkedHashMap) e0Var.f246511a).get(java.lang.Integer.valueOf(i17)));
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", sb6.toString());
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) e0Var.f246512b).get(java.lang.Integer.valueOf(i17));
        if (arrayList != null) {
            java.lang.Integer num = (java.lang.Integer) arrayList.get(arrayList.size() - 1);
            boolean z17 = num != null && num.intValue() == 0;
            if (!z17 || (((java.lang.Boolean) ((jz5.n) e0Var.f246513c).getValue()).booleanValue() && q0Var.f454424c > 0)) {
                com.tencent.mm.autogen.mmdata.rpt.AndroidOplogReportStruct androidOplogReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidOplogReportStruct();
                androidOplogReportStruct.f55070d = 36L;
                androidOplogReportStruct.f55071e = q0Var.b();
                if (z17) {
                    e21.x xVar = e21.x.f246594d;
                    androidOplogReportStruct.f55072f = 1;
                } else {
                    e21.x xVar2 = e21.x.f246594d;
                    androidOplogReportStruct.f55072f = 0;
                }
                androidOplogReportStruct.f55076j = i18;
                androidOplogReportStruct.f55073g = androidOplogReportStruct.b("ResultList", "[" + com.tencent.mm.sdk.platformtools.h2.a(arrayList, ";") + ']', true);
                androidOplogReportStruct.f55074h = j19;
                androidOplogReportStruct.f55075i = androidOplogReportStruct.b("FromScene", e21.a1.a(q0Var) + ((java.lang.String) ((java.util.LinkedHashMap) e0Var.f246511a).get(java.lang.Integer.valueOf(q0Var.f454423b))), true);
                androidOplogReportStruct.k();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).r(new e21.y(q0Var, e0Var), "oplog_reporter_serial_tag");
    }
}
