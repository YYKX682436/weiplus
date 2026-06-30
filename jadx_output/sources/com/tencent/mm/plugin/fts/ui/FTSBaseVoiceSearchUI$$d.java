package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes5.dex */
public final /* synthetic */ class FTSBaseVoiceSearchUI$$d implements android.animation.ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
    }
}
