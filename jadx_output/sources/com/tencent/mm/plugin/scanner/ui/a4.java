package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes13.dex */
public class a4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159505d;

    public a4(com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher) {
        this.f159505d = scannerFlashSwitcher;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f159505d.f159462d.setAlpha(1.0f);
    }
}
