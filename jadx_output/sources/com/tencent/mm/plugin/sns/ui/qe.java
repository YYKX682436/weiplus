package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qe extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f170339d;

    public qe(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f170339d = snsBaseGalleryUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(this.f170339d).setAlpha(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(this.f170339d).setAlpha(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$7");
    }
}
