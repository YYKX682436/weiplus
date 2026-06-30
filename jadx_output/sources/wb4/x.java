package wb4;

/* loaded from: classes4.dex */
public class x extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.o0 f444430b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444431c;

    public x(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        try {
            this.f444430b = (dc4.o0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new wb4.v(this));
            ofFloat.setDuration(400L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f444431c = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new wb4.w(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.o0 b(wb4.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        dc4.o0 o0Var = xVar.f444430b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        return o0Var;
    }

    @Override // wb4.j
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f444431c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
    }
}
