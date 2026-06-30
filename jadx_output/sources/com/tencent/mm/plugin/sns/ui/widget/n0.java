package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class n0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView f171228d;

    public n0(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f171228d = snsAdLandingPageFloatView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171228d;
        android.view.View a17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.a(snsAdLandingPageFloatView);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$5", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$5", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.b(snsAdLandingPageFloatView, false);
        com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent();
        java.lang.String c17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.c(snsAdLandingPageFloatView);
        am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
        zuVar.f8607a = c17;
        zuVar.f8608b = 123;
        snsAdFloatPageLifecycleEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171228d;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.b(snsAdLandingPageFloatView, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        snsAdLandingPageFloatView.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (snsAdLandingPageFloatView.f170802f != null && !snsAdLandingPageFloatView.f170808o) {
            snsAdLandingPageFloatView.f170808o = true;
            snsAdLandingPageFloatView.f170804h.L();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent();
        java.lang.String c17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.c(snsAdLandingPageFloatView);
        am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
        zuVar.f8607a = c17;
        zuVar.f8608b = 122;
        snsAdFloatPageLifecycleEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
    }
}
