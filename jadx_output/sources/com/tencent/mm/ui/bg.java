package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class bg implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f197883a;

    public bg(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f197883a = newChattingTabUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f197883a;
        newChattingTabUI.f197025l = false;
        newChattingTabUI.f197016c.setVisibility(8);
        gm0.j1.e().o();
        com.tencent.mm.sdk.platformtools.u3.m(0);
        newChattingTabUI.s();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationEnd");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f197883a;
        newChattingTabUI.f197025l = true;
        gm0.j1.e().p();
        com.tencent.mm.sdk.platformtools.u3.m(-8);
        newChattingTabUI.o(true, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationStart");
    }
}
