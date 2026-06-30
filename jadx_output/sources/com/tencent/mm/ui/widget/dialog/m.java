package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class m implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u f211922a;

    public m(com.tencent.mm.ui.widget.dialog.u uVar) {
        this.f211922a = uVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.widget.dialog.u uVar = this.f211922a;
        uVar.f211994f.C.setVisibility(8);
        uVar.f211994f.r(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211922a.f211994f;
        com.tencent.mm.ui.widget.dialog.j0.b(j0Var, j0Var.G);
    }
}
