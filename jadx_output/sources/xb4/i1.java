package xb4;

/* loaded from: classes4.dex */
public class i1 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.p0 f452946b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452947c;

    public i1(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f452946b = (com.tencent.mm.plugin.sns.ui.item.p0) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xb4.e1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.f1(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new xb4.g1(this));
            ofFloat2.setDuration(100L);
            ofFloat2.setStartDelay(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452947c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.h1(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereCardAdBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 b(xb4.i1 i1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = i1Var.f452946b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        return p0Var;
    }

    @Override // xb4.w
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f452947c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
    }
}
