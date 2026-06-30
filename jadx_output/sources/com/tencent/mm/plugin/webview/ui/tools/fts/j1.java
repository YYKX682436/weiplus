package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class j1 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public j1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
    }
}
