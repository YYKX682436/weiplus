package wb4;

/* loaded from: classes4.dex */
public class h0 extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.v0 f444410b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444411c;

    public h0(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        try {
            this.f444410b = (dc4.v0) vVar;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new wb4.d0(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new wb4.e0(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new wb4.f0(this));
            ofFloat2.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f444411c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new wb4.g0(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereCardAdDetailClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ dc4.v0 b(wb4.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        dc4.v0 v0Var = h0Var.f444410b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        return v0Var;
    }

    @Override // wb4.j
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f444411c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
    }
}
