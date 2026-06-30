package p44;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351788d;

    public f(android.view.View view) {
        this.f351788d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$createNonePickedImgFlipAnim$showAnim$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f351788d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/PickCardAnimBuilder$createNonePickedImgFlipAnim$showAnim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/PickCardAnimBuilder$createNonePickedImgFlipAnim$showAnim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$createNonePickedImgFlipAnim$showAnim$1$1");
    }
}
