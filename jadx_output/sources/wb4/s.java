package wb4;

/* loaded from: classes4.dex */
public class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.u f444424d;

    public s(wb4.u uVar) {
        this.f444424d = uVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            wb4.u uVar = this.f444424d;
            wb4.u.b(uVar).f228790t.setScaleX(floatValue);
            wb4.u.b(uVar).f228790t.setScaleY(floatValue);
            wb4.u.b(uVar).f228790t.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
    }
}
