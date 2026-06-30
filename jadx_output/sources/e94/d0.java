package e94;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e94.e0 f250374d;

    public d0(e94.e0 e0Var) {
        this.f250374d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6$1");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView.a(this.f250374d.f250376d).c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6$1");
    }
}
