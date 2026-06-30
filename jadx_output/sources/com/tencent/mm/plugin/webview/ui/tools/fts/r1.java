package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f184598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184599g;

    public r1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, int i17, int i18, float f17) {
        this.f184599g = fTSSOSHomeWebViewUI;
        this.f184596d = i17;
        this.f184597e = i18;
        this.f184598f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        final int i17 = this.f184596d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        final int i18 = this.f184597e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow: 0x%X%X, %.2f", valueOf, java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(this.f184598f));
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184599g;
        android.view.View view = fTSSOSHomeWebViewUI.f184288c5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = fTSSOSHomeWebViewUI.f184288c5;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        fTSSOSHomeWebViewUI.f184288c5.setBackgroundColor((-16777216) | i18);
        android.animation.ValueAnimator valueAnimator = fTSSOSHomeWebViewUI.I5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int S6 = fTSSOSHomeWebViewUI.S6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.r1$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.tencent.mm.plugin.webview.ui.tools.fts.r1 r1Var = com.tencent.mm.plugin.webview.ui.tools.fts.r1.this;
                r1Var.getClass();
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.ya(r1Var.f184599g, i18, i17, S6, ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.s1(this, S6));
        ofFloat.setDuration((int) (java.lang.Math.max(0.0f, r5) * 1000.0f));
        ofFloat.start();
        fTSSOSHomeWebViewUI.I5 = ofFloat;
        fTSSOSHomeWebViewUI.f184288c5.setOnClickListener(fTSSOSHomeWebViewUI.Q5);
        fTSSOSHomeWebViewUI.E5 = true;
    }
}
