package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cs implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f168144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.ScaleAnimation f168145b;

    public cs(com.tencent.mm.plugin.sns.ui.bs bsVar, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.animation.ScaleAnimation scaleAnimation) {
        this.f168144a = weImageView;
        this.f168145b = scaleAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        this.f168144a.startAnimation(this.f168145b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
    }
}
