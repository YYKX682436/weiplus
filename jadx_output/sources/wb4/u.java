package wb4;

/* loaded from: classes4.dex */
public class u extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.o0 f444426b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444427c;

    public u(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        try {
            this.f444426b = (dc4.o0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new wb4.s(this));
            ofFloat.setDuration(400L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f444427c = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new wb4.t(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SlideFullCardItemAdBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.o0 b(wb4.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        dc4.o0 o0Var = uVar.f444426b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        return o0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f444427c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
    }
}
