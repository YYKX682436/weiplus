package xb4;

/* loaded from: classes4.dex */
public class d1 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final q74.d f452927c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.AnimatorSet f452928d;

    public d1(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f453000a = mMActivity;
            this.f452927c = (q74.d) baseViewHolder;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xb4.a1(this));
            ofFloat.setDuration(400L);
            ofFloat.addListener(new xb4.b1(this));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f452928d = animatorSet;
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(new xb4.c1(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th6.toString());
        }
    }

    public static /* synthetic */ q74.d b(xb4.d1 d1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        q74.d dVar = d1Var.f452927c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        return dVar;
    }

    @Override // xb4.y
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        android.animation.AnimatorSet animatorSet = this.f452928d;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
    }
}
