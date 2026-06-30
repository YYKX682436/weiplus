package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class u0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanRectDecorView f159999d;

    public u0(com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView) {
        this.f159999d = scanRectDecorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f159999d.f159911e.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView = this.f159999d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) scanRectDecorView.f159911e.getLayoutParams();
        layoutParams.topMargin = scanRectDecorView.f159912f.getRect().top;
        scanRectDecorView.f159911e.setLayoutParams(layoutParams);
        scanRectDecorView.f159911e.setVisibility(0);
    }
}
