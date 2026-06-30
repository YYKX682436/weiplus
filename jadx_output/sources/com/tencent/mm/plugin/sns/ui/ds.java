package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ds implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f168206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f168207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f168208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f168209d;

    public ds(com.tencent.mm.plugin.sns.ui.bs bsVar, android.widget.LinearLayout linearLayout, java.lang.Runnable runnable, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f168209d = bsVar;
        this.f168206a = linearLayout;
        this.f168207b = runnable;
        this.f168208c = snsInfo;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        android.widget.LinearLayout linearLayout = this.f168206a;
        if (linearLayout != null) {
            this.f168209d.f168036b.f169717r.b(linearLayout);
            linearLayout.setPressed(false);
        }
        java.lang.Runnable runnable = this.f168207b;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f168208c;
        if (snsInfo != null && snsInfo.isAd()) {
            l44.b3.f316041a.f(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
    }
}
