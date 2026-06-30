package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class p3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159611d;

    public p3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159611d = scanTranslationResultUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f159611d.f159379i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f159611d.f159379i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
    }
}
