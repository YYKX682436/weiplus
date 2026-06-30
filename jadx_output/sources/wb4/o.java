package wb4;

/* loaded from: classes4.dex */
public class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.r f444419d;

    public o(wb4.r rVar) {
        this.f444419d = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 1.0f) {
            wb4.r rVar = this.f444419d;
            wb4.r.b(rVar).B.setScaleX(floatValue);
            wb4.r.b(rVar).B.setScaleY(floatValue);
            android.view.View view = wb4.r.b(rVar).B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$1");
    }
}
