package vb4;

/* loaded from: classes4.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f434807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.f f434808e;

    public d(vb4.f fVar, boolean z17) {
        this.f434808e = fVar;
        this.f434807d = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f434808e;
        fVar.f434811n++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = fVar.f434794a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f - floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (floatValue != 1.0f) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f434794a.getLayoutParams();
            layoutParams.leftMargin = (int) (fVar.f434797d * floatValue);
            layoutParams.topMargin = (int) (fVar.f434798e * floatValue);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) fVar.f434794a.getParent();
            if (this.f434807d) {
                layoutParams.rightMargin = (int) ((viewGroup.getWidth() - (fVar.f434804k - (fVar.f434802i * floatValue))) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) ((viewGroup.getHeight() - (fVar.f434803j - (fVar.f434801h * floatValue))) - layoutParams.topMargin);
            } else {
                layoutParams.rightMargin = (int) (((viewGroup.getWidth() * floatValue) - (fVar.f434799f * floatValue)) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) (((viewGroup.getHeight() * floatValue) - (fVar.f434800g * floatValue)) - layoutParams.topMargin);
            }
            fVar.f434794a.setLayoutParams(layoutParams);
        }
        vb4.c cVar = fVar.f434796c;
        if (cVar != null) {
            cVar.b(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
    }
}
