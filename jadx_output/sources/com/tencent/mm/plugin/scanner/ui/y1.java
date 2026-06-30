package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class y1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159819d;

    public y1(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159819d = scanTranslationCaptureUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159819d;
        scanTranslationCaptureUI.f159349J = false;
        scanTranslationCaptureUI.A.setVisibility(8);
    }
}
