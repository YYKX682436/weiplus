package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes3.dex */
public class m3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f184522d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184525g;

    public m3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, int i17, android.view.View view) {
        this.f184525g = fTSWeAppBaseWebViewUI;
        this.f184523e = i17;
        this.f184524f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        float intValue = num.intValue();
        int i17 = this.f184523e;
        float f17 = intValue / i17;
        if (f17 <= 0.18d && !this.f184522d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd x:value:%d, originalWidth:%d， progress:%f", java.lang.Integer.valueOf(num.intValue()), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17));
            this.f184522d = true;
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = this.f184525g;
            if (fTSWeAppBaseWebViewUI.V4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd ljd x:finish");
                fTSWeAppBaseWebViewUI.V4 = false;
                fTSWeAppBaseWebViewUI.ia();
                fTSWeAppBaseWebViewUI.finish();
            }
        }
        android.view.View view = this.f184524f;
        view.getLayoutParams().width = num.intValue();
        view.requestLayout();
    }
}
