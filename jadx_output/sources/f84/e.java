package f84;

/* loaded from: classes4.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260183d;

    public e(f84.u uVar) {
        this.f260183d = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$doInitAnim$animatorSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        f84.u uVar = this.f260183d;
        android.view.View y17 = f84.u.y(uVar);
        if (y17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(y17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View y18 = f84.u.y(uVar);
        if (y18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(y18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(y18, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$doInitAnim$animatorSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$doInitAnim$animatorSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        f84.u uVar = this.f260183d;
        android.view.View y17 = f84.u.y(uVar);
        if (y17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(y17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.view.View E = uVar.E();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (E != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(E, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            E.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(E, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$doInitAnim$animatorSet$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        uVar.I = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$doInitAnim$animatorSet$1$1");
    }
}
