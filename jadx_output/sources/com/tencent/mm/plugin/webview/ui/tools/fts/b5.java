package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class b5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.c5 f184357d;

    public b5(com.tencent.mm.plugin.webview.ui.tools.fts.c5 c5Var) {
        this.f184357d = c5Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f184357d.f184692r = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.webview.ui.tools.fts.c5 c5Var = this.f184357d;
        c5Var.f184692r = false;
        com.tencent.mm.plugin.webview.ui.tools.fts.t4 t4Var = c5Var.f184693s;
        if (t4Var != null) {
            t4Var.onAnimationEnd();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.webview.ui.tools.fts.c5 c5Var = this.f184357d;
        c5Var.f184692r = true;
        com.tencent.mm.plugin.webview.ui.tools.fts.t4 t4Var = c5Var.f184693s;
        if (t4Var != null) {
            t4Var.onAnimationStart();
        }
    }
}
