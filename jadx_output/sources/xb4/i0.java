package xb4;

/* loaded from: classes4.dex */
public class i0 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.k f452944c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f452945d;

    public i0(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f453000a = mMActivity;
        this.f452944c = (com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new xb4.e0(this));
        ofFloat.setDuration(400L);
        ofFloat.addListener(new xb4.f0(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new xb4.g0(this));
        ofFloat2.setDuration(100L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f452945d = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new xb4.h0(this));
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.k b(xb4.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        com.tencent.mm.plugin.sns.ui.item.k kVar = i0Var.f452944c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        return kVar;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f452945d;
        if (!animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
    }
}
