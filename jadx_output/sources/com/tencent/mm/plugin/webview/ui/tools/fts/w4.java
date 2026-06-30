package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class w4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.z4 f184714d;

    public w4(com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var) {
        this.f184714d = z4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f184714d.f184692r = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = this.f184714d;
        z4Var.f184692r = false;
        com.tencent.mm.plugin.webview.ui.tools.fts.t4 t4Var = z4Var.f184693s;
        if (t4Var != null) {
            t4Var.onAnimationEnd();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = this.f184714d;
        z4Var.f184692r = true;
        com.tencent.mm.plugin.webview.ui.tools.fts.t4 t4Var = z4Var.f184693s;
        if (t4Var != null) {
            t4Var.onAnimationStart();
        }
    }
}
