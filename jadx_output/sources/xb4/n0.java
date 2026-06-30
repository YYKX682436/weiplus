package xb4;

/* loaded from: classes4.dex */
public class n0 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.AnimatorSet f452967b;

    public n0(com.tencent.mm.ui.MMActivity mMActivity, u74.d dVar) {
        try {
            int i17 = dVar.T.f425131a;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xb4.j0(this, dVar));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.k0(this, dVar));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new xb4.l0(this, dVar));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452967b = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.m0(this, dVar));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAnim.back", "init exp=" + th6.toString());
        }
    }

    @Override // xb4.w
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
        android.animation.AnimatorSet animatorSet = this.f452967b;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
    }
}
