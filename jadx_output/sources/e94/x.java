package e94;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView f250392d;

    public x(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView twistDegreeView) {
        this.f250392d = twistDegreeView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f250392d.f163949t, 0.9f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e94.w(this));
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
    }
}
