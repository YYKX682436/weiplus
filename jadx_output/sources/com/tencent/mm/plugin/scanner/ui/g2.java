package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class g2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159554d;

    public g2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159554d = scanTranslationCaptureUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent playScanTranslateAnimEvent = new com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent();
        playScanTranslateAnimEvent.f54617g.f7172a = 3;
        playScanTranslateAnimEvent.e();
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159554d;
        scanTranslationCaptureUI.f159349J = false;
        scanTranslationCaptureUI.T6();
        scanTranslationCaptureUI.finish();
    }
}
