package wb4;

/* loaded from: classes4.dex */
public class r extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.d0 f444422b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444423c;

    public r(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        this.f444422b = (dc4.d0) vVar;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new wb4.o(this));
        ofFloat.setDuration(400L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new wb4.p(this));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f444423c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new wb4.q(this));
    }

    public static /* synthetic */ dc4.d0 b(wb4.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        dc4.d0 d0Var = rVar.f444422b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        return d0Var;
    }

    @Override // wb4.j
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f444423c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
    }
}
