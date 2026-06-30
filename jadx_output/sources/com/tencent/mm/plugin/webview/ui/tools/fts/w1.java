package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class w1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f184704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v1 f184706g;

    public w1(com.tencent.mm.plugin.webview.ui.tools.fts.v1 v1Var, int i17, float f17, int i18) {
        this.f184706g = v1Var;
        this.f184703d = i17;
        this.f184704e = f17;
        this.f184705f = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow.onAnimationCancel");
        onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow.onAnimationEnd");
        com.tencent.mm.plugin.webview.ui.tools.fts.v1 v1Var = this.f184706g;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.ya(v1Var.f184662e, this.f184703d, (int) this.f184704e, this.f184705f, 0.0f);
        android.view.View view = v1Var.f184662e.f184288c5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$21$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$21$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow.onAnimationStart");
    }
}
