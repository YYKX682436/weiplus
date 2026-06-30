package wb4;

/* loaded from: classes4.dex */
public class h extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final dc4.p f444408b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f444409c;

    public h(com.tencent.mm.ui.MMActivity mMActivity, dc4.v vVar) {
        dc4.p pVar = (dc4.p) vVar;
        this.f444408b = pVar;
        if (pVar.l() == null) {
            return;
        }
        android.view.View I = pVar.l().I();
        java.util.List J2 = pVar.l().J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new wb4.e(this, I));
        ofFloat.setDuration(400L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new wb4.f(this, J2));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f444409c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new wb4.g(this, I, J2));
    }

    @Override // wb4.j
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
        com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailClickAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.CardAdDetailClickAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f444409c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
    }
}
