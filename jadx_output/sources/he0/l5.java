package he0;

/* loaded from: classes4.dex */
public class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f280755d;

    public l5(he0.m5 m5Var, long j17) {
        this.f280755d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsListener$1");
        com.tencent.mm.plugin.sns.model.s5.r((int) this.f280755d);
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        new com.tencent.mm.autogen.events.UpdateSnsHeaderNotiftyListEvent().e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsListener$1");
    }
}
