package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class s1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.r1 f184611e;

    public s1(com.tencent.mm.plugin.webview.ui.tools.fts.r1 r1Var, int i17) {
        this.f184611e = r1Var;
        this.f184610d = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow.onAnimationCancel");
        onAnimationEnd(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow.onAnimationEnd");
        com.tencent.mm.plugin.webview.ui.tools.fts.r1 r1Var = this.f184611e;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.ya(r1Var.f184599g, r1Var.f184597e, r1Var.f184596d, this.f184610d, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow.onAnimationStart");
    }
}
