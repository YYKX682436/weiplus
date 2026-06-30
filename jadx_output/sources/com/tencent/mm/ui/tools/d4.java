package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class d4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n4 f210349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f210351f;

    public d4(com.tencent.mm.ui.tools.s4 s4Var, com.tencent.mm.ui.tools.n4 n4Var, android.view.View view) {
        this.f210351f = s4Var;
        this.f210349d = n4Var;
        this.f210350e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.ui.tools.s4 s4Var = this.f210351f;
        s4Var.getClass();
        s4Var.f210718y = 3;
        com.tencent.mm.ui.tools.n4 n4Var = this.f210349d;
        if (n4Var != null) {
            n4Var.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.tools.n4 n4Var = this.f210349d;
        if (n4Var != null) {
            n4Var.onAnimationEnd();
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f210351f;
        s4Var.getClass();
        s4Var.f210718y = 3;
        android.view.View view = this.f210350e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "pennqin, gallery animation result, sx %s, sy %s, tx %s, ty %s.", java.lang.Float.valueOf(view.getScaleX()), java.lang.Float.valueOf(view.getScaleY()), java.lang.Float.valueOf(view.getTranslationX()), java.lang.Float.valueOf(view.getTranslationY()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.ui.tools.n4 n4Var = this.f210349d;
        if (n4Var != null) {
            n4Var.onAnimationStart();
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f210351f;
        s4Var.getClass();
        s4Var.f210718y = 2;
    }
}
