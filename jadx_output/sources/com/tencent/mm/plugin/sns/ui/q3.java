package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q3 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f170310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f170311b;

    public q3(com.tencent.mm.plugin.sns.ui.p3 p3Var, android.widget.LinearLayout linearLayout, java.lang.Runnable runnable) {
        this.f170310a = linearLayout;
        this.f170311b = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        android.widget.LinearLayout linearLayout = this.f170310a;
        if (linearLayout != null) {
            linearLayout.setPressed(false);
        }
        java.lang.Runnable runnable = this.f170311b;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }
}
