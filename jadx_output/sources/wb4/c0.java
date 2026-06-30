package wb4;

/* loaded from: classes4.dex */
public class c0 extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.v0 f444396b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444397c;

    public c0(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        try {
            this.f444396b = (dc4.v0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new wb4.y(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new wb4.z(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new wb4.a0(this));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f444397c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new wb4.b0(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereCardAdDetailBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.v0 b(wb4.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        dc4.v0 v0Var = c0Var.f444396b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        return v0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f444397c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
    }
}
