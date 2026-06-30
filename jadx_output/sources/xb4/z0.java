package xb4;

/* loaded from: classes4.dex */
public class z0 extends xb4.w {

    /* renamed from: b, reason: collision with root package name */
    public final q74.d f453004b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f453005c;

    public z0(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f453004b = (q74.d) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xb4.w0(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.x0(this));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f453005c = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new xb4.y0(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SlideFullCardItemAdBackAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ q74.d b(xb4.z0 z0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        q74.d dVar = z0Var.f453004b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        return dVar;
    }

    @Override // xb4.w
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        android.animation.AnimatorSet animatorSet = this.f453005c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
    }
}
