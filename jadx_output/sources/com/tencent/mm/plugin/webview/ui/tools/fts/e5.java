package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class e5 extends com.tencent.mm.plugin.webview.ui.tools.fts.v4 {
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosAnimatorController", "search to init");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.f184689o[0][0] - this.f184677c >= 0.0f) {
            ofFloat.addUpdateListener(this.f184697w);
        } else {
            ofFloat.addUpdateListener(this.f184698x);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.d5(this));
        animatorSet.start();
    }
}
