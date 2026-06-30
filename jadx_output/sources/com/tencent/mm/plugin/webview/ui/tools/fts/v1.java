package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f184661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184662e;

    public v1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, float f17) {
        this.f184662e = fTSSOSHomeWebViewUI;
        this.f184661d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow: %.2f", java.lang.Float.valueOf(this.f184661d));
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184662e;
        fTSSOSHomeWebViewUI.E5 = false;
        final float alpha = fTSSOSHomeWebViewUI.f184288c5.getAlpha() * 255.0f;
        final int color = fTSSOSHomeWebViewUI.f184288c5.getBackground() instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) fTSSOSHomeWebViewUI.f184288c5.getBackground()).getColor() & 16777215 : 0;
        android.animation.ValueAnimator valueAnimator = fTSSOSHomeWebViewUI.I5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int S6 = fTSSOSHomeWebViewUI.S6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.v1$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.tencent.mm.plugin.webview.ui.tools.fts.v1 v1Var = com.tencent.mm.plugin.webview.ui.tools.fts.v1.this;
                v1Var.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.ya(v1Var.f184662e, color, (int) alpha, S6, floatValue);
            }
        });
        ofFloat.setDuration((int) (java.lang.Math.max(0.0f, r0) * 1000.0f));
        ofFloat.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.w1(this, color, alpha, S6));
        ofFloat.start();
        fTSSOSHomeWebViewUI.I5 = ofFloat;
    }
}
