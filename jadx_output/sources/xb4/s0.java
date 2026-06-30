package xb4;

/* loaded from: classes4.dex */
public class s0 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452984c;

    public s0(com.tencent.mm.ui.MMActivity mMActivity, u74.d dVar) {
        try {
            int i17 = dVar.T.f425131a;
            this.f453000a = mMActivity;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xb4.o0(this, dVar));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.p0(this, dVar));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new xb4.q0(this, dVar));
            ofFloat2.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452984c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.r0(this, dVar));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAnim.click", "init exp=" + th6.toString());
        }
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        android.animation.AnimatorSet animatorSet = this.f452984c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
    }
}
