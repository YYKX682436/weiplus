package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class j4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n4 f210509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f210510b;

    public j4(com.tencent.mm.ui.tools.s4 s4Var, com.tencent.mm.ui.tools.n4 n4Var) {
        this.f210510b = s4Var;
        this.f210509a = n4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation end!");
        com.tencent.mm.ui.tools.n4 n4Var = this.f210509a;
        if (n4Var != null) {
            n4Var.onAnimationEnd();
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f210510b;
        s4Var.getClass();
        s4Var.f210718y = 1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation start!");
        com.tencent.mm.ui.tools.n4 n4Var = this.f210509a;
        if (n4Var != null) {
            n4Var.onAnimationStart();
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f210510b;
        s4Var.getClass();
        s4Var.f210718y = 4;
    }
}
