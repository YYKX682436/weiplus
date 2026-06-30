package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.v f184217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f184218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f184219f;

    public q(com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar, android.app.Activity activity, yz5.a aVar) {
        this.f184217d = vVar;
        this.f184218e = activity;
        this.f184219f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar = this.f184217d;
        if (vVar.f184227c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "addFloatBallEduViewInner disableEduView");
            return;
        }
        android.app.Activity activity = this.f184218e;
        if (((com.tencent.mm.ui.MMActivity) activity).isFinishing()) {
            return;
        }
        vVar.b((com.tencent.mm.ui.MMActivity) activity, true, this.f184219f);
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = vVar.f184226b;
        if (contentFloatBallEduView != null) {
            contentFloatBallEduView.setVisibility(0);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView2 = vVar.f184226b;
        if (contentFloatBallEduView2 != null) {
            contentFloatBallEduView2.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView3 = vVar.f184226b;
        if (contentFloatBallEduView3 != null && (animate = contentFloatBallEduView3.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(100L)) != null) {
            duration.start();
        }
        pv.a0 a0Var = vVar.f184228d;
        if (a0Var != null) {
            ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ri(a0Var, true);
        }
    }
}
