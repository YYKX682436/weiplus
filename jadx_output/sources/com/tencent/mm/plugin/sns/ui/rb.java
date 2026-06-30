package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rb implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sb f170411a;

    public rb(com.tencent.mm.plugin.sns.ui.sb sbVar) {
        this.f170411a = sbVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
        com.tencent.mm.plugin.sns.ui.sb sbVar = this.f170411a;
        android.view.View childAt = sbVar.f170448a.getChildAt(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1L);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.qb(this));
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.W6(sbVar.f170449b).startAnimation(alphaAnimation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22$1");
    }
}
