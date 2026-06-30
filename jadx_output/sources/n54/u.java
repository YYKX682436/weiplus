package n54;

/* loaded from: classes14.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout f335154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f335155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n54.o f335156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f335157g;

    public u(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout, yz5.q qVar, n54.o oVar, float f17) {
        this.f335154d = scrollableFrameLayout;
        this.f335155e = qVar;
        this.f335156f = oVar;
        this.f335157g = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout.f163063w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        this.f335154d.f163071q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationY  ");
        float f17 = this.f335157g;
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("ScrollableFrameLayout", sb6.toString());
        yz5.q qVar = this.f335155e;
        if (qVar != null) {
            qVar.invoke(this.f335156f, 1, java.lang.Float.valueOf(f17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout.f163063w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        this.f335154d.f163071q = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDoingPropertyAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout");
        yz5.q qVar = this.f335155e;
        if (qVar != null) {
            qVar.invoke(this.f335156f, 0, java.lang.Float.valueOf(0.0f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$1");
    }
}
