package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView f171198d;

    public l0(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f171198d = snsAdLandingPageFloatView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171198d;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.b(snsAdLandingPageFloatView, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (snsAdLandingPageFloatView.f170803g != null) {
            snsAdLandingPageFloatView.f170804h.K();
            snsAdLandingPageFloatView.post(new com.tencent.mm.plugin.sns.ui.widget.p0(snsAdLandingPageFloatView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent();
        java.lang.String c17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.c(snsAdLandingPageFloatView);
        am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
        zuVar.f8607a = c17;
        zuVar.f8608b = 121;
        snsAdFloatPageLifecycleEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171198d;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.b(snsAdLandingPageFloatView, true);
        com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent();
        java.lang.String c17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.c(snsAdLandingPageFloatView);
        am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
        zuVar.f8607a = c17;
        zuVar.f8608b = 120;
        snsAdFloatPageLifecycleEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
    }
}
