package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class re implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f170416e;

    public re(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI, int i17) {
        this.f170416e = snsBaseGalleryUI;
        this.f170415d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$8");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f170416e;
        if (floatValue <= 0.1f) {
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(snsBaseGalleryUI).setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(snsBaseGalleryUI).setAlpha((1.0f - floatValue) * 10.0f);
        }
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(snsBaseGalleryUI).setTranslationY(floatValue * (this.f170415d - com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.V6(snsBaseGalleryUI).getHeight()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$8");
    }
}
