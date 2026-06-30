package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes3.dex */
public class o3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f184569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f184570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f184571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f184572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f184573i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f184574m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f184575n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184576o;

    public o3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, int i17) {
        this.f184576o = fTSWeAppBaseWebViewUI;
        this.f184568d = view;
        this.f184569e = f17;
        this.f184570f = f18;
        this.f184571g = f19;
        this.f184572h = f27;
        this.f184573i = f28;
        this.f184574m = f29;
        this.f184575n = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f184568d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = this.f184569e;
        android.view.View view2 = this.f184568d;
        view2.setScaleX(f17);
        view2.setScaleY(this.f184570f);
        view2.setX(this.f184571g);
        view2.setY(this.f184572h);
        view2.setTranslationX(this.f184573i);
        view2.setTranslationY(this.f184574m);
        view2.getLayoutParams().width = this.f184575n;
        view2.requestLayout();
        view2.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.n3(this), 300L);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = this.f184576o;
        if (fTSWeAppBaseWebViewUI.V4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd ljd x:finish2");
            fTSWeAppBaseWebViewUI.V4 = false;
            fTSWeAppBaseWebViewUI.ia();
            fTSWeAppBaseWebViewUI.finish();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
