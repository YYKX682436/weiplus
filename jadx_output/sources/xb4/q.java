package xb4;

/* loaded from: classes4.dex */
public class q extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final s74.p0 f452977b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452978c;

    public q(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        s74.p0 p0Var = (s74.p0) baseViewHolder;
        this.f452977b = p0Var;
        s74.o2 H = ((s74.z0) p0Var.f169283m0).H();
        if (H == null) {
            return;
        }
        android.view.View I = H.I();
        java.util.List J2 = H.J();
        if (I == null || J2 == null) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new xb4.m(this, I));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.n(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new xb4.o(this, J2));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f452978c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.p(this, J2, I));
    }

    @Override // xb4.w
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        com.tencent.mars.xlog.Log.e("MicroMsg.AdDynamicCardBackAnimation", "error ! do not use this class!");
        ca4.q.a("MicroMsg.AdDynamicCardBackAnimation", "useOldAnimation", 8);
        android.animation.AnimatorSet animatorSet = this.f452978c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
    }
}
