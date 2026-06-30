package i64;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f289160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.i1 f289161f;

    public d1(i64.i1 i1Var, int i17, java.lang.Object[] objArr) {
        this.f289161f = i1Var;
        this.f289159d = i17;
        this.f289160e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
        r45.e44 e44Var = new r45.e44();
        int i17 = this.f289159d;
        e44Var.f373007d = i17;
        e44Var.f373009f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e44Var.f373010g = 1;
        i64.i1 i1Var = this.f289161f;
        java.lang.String c17 = i1Var.c(this.f289160e);
        e44Var.f373008e = new com.tencent.mm.protobuf.g(c17.getBytes());
        i64.i1.b(i1Var).f373180d.add(e44Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLogMgr", "snsadlog " + i17 + " " + c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        long j17 = i1Var.f289196e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (j17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            i1Var.f289196e = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
    }
}
