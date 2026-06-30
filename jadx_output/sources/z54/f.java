package z54;

/* loaded from: classes4.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.g f470280d;

    public f(z54.g gVar) {
        this.f470280d = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        z54.g gVar = this.f470280d;
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        z54.g gVar = this.f470280d;
        if (z54.g.e(gVar) != null) {
            z54.g.e(gVar).onAnimationStart();
        }
        android.view.View f17 = z54.g.f(gVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenShrinkAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/ui/animation/AdHalfScreenShrinkAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenShrinkAnimation$2");
    }
}
