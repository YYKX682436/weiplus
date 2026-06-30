package vb4;

/* loaded from: classes4.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f434814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.i f434815e;

    public g(vb4.i iVar, boolean z17) {
        this.f434815e = iVar;
        this.f434814d = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        vb4.i iVar = this.f434815e;
        boolean z17 = this.f434814d;
        if (z17) {
            android.view.View view = iVar.f434794a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f - (0.2f * floatValue)));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = iVar.f434794a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f - floatValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (floatValue != 0.0f) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) iVar.f434794a.getLayoutParams();
            layoutParams.leftMargin = (int) (iVar.f434797d * floatValue);
            layoutParams.topMargin = (int) (iVar.f434798e * floatValue);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) iVar.f434794a.getParent();
            if (z17) {
                layoutParams.rightMargin = (int) ((viewGroup.getWidth() - (iVar.f434804k - (iVar.f434802i * floatValue))) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) ((viewGroup.getHeight() - (iVar.f434803j - (iVar.f434801h * floatValue))) - layoutParams.topMargin);
            } else {
                layoutParams.rightMargin = (int) (((viewGroup.getWidth() * floatValue) - (iVar.f434799f * floatValue)) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) (((viewGroup.getHeight() * floatValue) - (iVar.f434800g * floatValue)) - layoutParams.topMargin);
            }
            iVar.f434794a.setLayoutParams(layoutParams);
        }
        vb4.c cVar = iVar.f434796c;
        if (cVar != null) {
            cVar.b(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
    }
}
