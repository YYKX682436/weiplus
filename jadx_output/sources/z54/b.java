package z54;

/* loaded from: classes4.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.d f470277d;

    public b(z54.d dVar) {
        this.f470277d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        z54.d dVar = this.f470277d;
        if (z54.d.e(dVar) != null) {
            z54.d.e(dVar).onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        z54.d dVar = this.f470277d;
        if (z54.d.e(dVar) != null) {
            z54.d.e(dVar).onAnimationStart();
        }
        android.view.ViewGroup.LayoutParams layoutParams = z54.d.f(dVar).getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
            return;
        }
        android.view.ViewParent parent = z54.d.f(dVar).getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i17 = dVar.f434804k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetWidth$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i18 = dVar.f434802i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWidthDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i19 = i17 - i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i27 = dVar.f434803j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetHeight$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i28 = dVar.f434801h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHeightDelta$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i29 = i27 - i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i37 = dVar.f434797d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumb_left$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        layoutParams2.leftMargin = i37;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        int i38 = dVar.f434798e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumb_top$p$s-537423224", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation");
        layoutParams2.topMargin = i38;
        layoutParams2.rightMargin = (viewGroup.getWidth() - i19) - layoutParams2.leftMargin;
        layoutParams2.bottomMargin = (viewGroup.getHeight() - i29) - layoutParams2.topMargin;
        layoutParams2.width = i19;
        layoutParams2.height = i29;
        z54.d.f(dVar).setLayoutParams(layoutParams2);
        android.view.View f17 = z54.d.f(dVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenExpandAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenExpandAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$2");
    }
}
