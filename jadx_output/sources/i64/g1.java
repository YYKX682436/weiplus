package i64;

/* loaded from: classes4.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i64.i1 f289175d;

    public g1(i64.i1 i1Var) {
        this.f289175d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        i64.i1 i1Var = this.f289175d;
        long j17 = i1Var.f289196e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (currentTimeMillis - j17 >= 60000 || i64.i1.b(i1Var).f373180d.size() > 1000) {
            if (i64.i1.b(i1Var) != null && i64.i1.b(i1Var).f373180d.size() > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                r45.e96 e96Var = i1Var.f289198g;
                if (e96Var.f373180d.size() > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("trigerSave ");
                    java.util.LinkedList linkedList = e96Var.f373180d;
                    sb6.append(linkedList.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLogMgr", sb6.toString());
                    com.tencent.mm.plugin.sns.model.l4.Ij().y0(e96Var);
                    linkedList.clear();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            i1Var.f289196e = 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
    }
}
