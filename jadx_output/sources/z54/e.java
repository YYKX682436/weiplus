package z54;

/* loaded from: classes4.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.g f470279d;

    public e(z54.g gVar) {
        this.f470279d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
            return;
        }
        float floatValue = f17.floatValue();
        boolean z17 = floatValue == 0.0f;
        z54.g gVar = this.f470279d;
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = z54.g.f(gVar).getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
                return;
            }
            android.view.ViewParent parent = z54.g.f(gVar).getParent();
            if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetWidth$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i17 = gVar.f434804k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetWidth$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWidthDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i18 = gVar.f434802i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWidthDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            float f18 = i17 - (i18 * floatValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetHeight$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i19 = gVar.f434803j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetHeight$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHeightDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i27 = gVar.f434801h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHeightDelta$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            float f19 = i19 - (i27 * floatValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i28 = gVar.f434805l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumb_left$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i29 = gVar.f434797d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumb_left$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i37 = gVar.f434805l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetLeft$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            layoutParams2.leftMargin = (int) (i28 + ((i29 - i37) * floatValue));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i38 = gVar.f434806m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumb_top$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i39 = gVar.f434798e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumb_top$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            int i47 = gVar.f434806m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTargetTop$p$s1957697529", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation");
            layoutParams2.topMargin = (int) (i38 + ((i39 - i47) * floatValue));
            layoutParams2.rightMargin = (int) ((r3.getWidth() - f18) - layoutParams2.leftMargin);
            layoutParams2.bottomMargin = (int) ((r3.getHeight() - f19) - layoutParams2.topMargin);
            layoutParams2.width = (int) f18;
            layoutParams2.height = (int) f19;
            z54.g.f(gVar).setLayoutParams(layoutParams2);
        }
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).b(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$1");
    }
}
