package wb4;

/* loaded from: classes4.dex */
public class n extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.d0 f444417b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444418c;

    public n(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        this.f444417b = (dc4.d0) vVar;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new wb4.k(this));
        ofFloat.setDuration(400L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new wb4.l(this));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f444418c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new wb4.m(this));
    }

    public static /* synthetic */ dc4.d0 b(wb4.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        dc4.d0 d0Var = nVar.f444417b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        return d0Var;
    }

    @Override // wb4.i
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f444418c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
    }
}
