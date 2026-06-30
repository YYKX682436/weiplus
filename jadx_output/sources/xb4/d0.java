package xb4;

/* loaded from: classes4.dex */
public class d0 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.k f452925b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f452926c;

    public d0(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f452925b = (com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new xb4.z(this));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.a0(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new xb4.b0(this));
        ofFloat2.setDuration(100L);
        ofFloat2.setStartDelay(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f452926c = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.c0(this));
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.k b(xb4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        com.tencent.mm.plugin.sns.ui.item.k kVar = d0Var.f452925b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        return kVar;
    }

    @Override // xb4.w
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f452926c;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
    }
}
