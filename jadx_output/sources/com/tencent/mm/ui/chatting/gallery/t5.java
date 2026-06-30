package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class t5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201403e;

    public t5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, int i17) {
        this.f201403e = imageGalleryUI;
        this.f201402d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201403e;
        if (floatValue <= 0.1f) {
            imageGalleryUI.R2.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            imageGalleryUI.R2.setAlpha((1.0f - floatValue) * 10.0f);
        }
        imageGalleryUI.R2.setTranslationY(floatValue * (this.f201402d - r0.getHeight()));
    }
}
