package xb4;

/* loaded from: classes4.dex */
public class n1 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.p0 f452968c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f452969d;

    public n1(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f453000a = mMActivity;
            this.f452968c = (com.tencent.mm.plugin.sns.ui.item.p0) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xb4.j1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.k1(this));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new xb4.l1(this));
            ofFloat2.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452969d = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new xb4.m1(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereCardAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 b(xb4.n1 n1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = n1Var.f452968c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        return p0Var;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f452969d;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
    }
}
