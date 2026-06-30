package i64;

/* loaded from: classes4.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i64.i1 f289170d;

    public f1(i64.i1 i1Var) {
        this.f289170d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2");
        com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.e1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2");
    }
}
