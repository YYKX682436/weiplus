package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class yf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ag f212588a;

    public yf(com.tencent.mm.ui.ag agVar) {
        this.f212588a = agVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.ag agVar = this.f212588a;
        com.tencent.mm.ui.n8 n8Var = agVar.f197134a.f197015b;
        if (n8Var != null) {
            com.tencent.mm.ui.MMFragment h17 = ((com.tencent.mm.ui.HomeUI) n8Var).f196761t.h(0);
            if (h17 instanceof com.tencent.mm.ui.conversation.MainUI) {
                com.tencent.mm.ui.conversation.MainUIView mainUIView = ((com.tencent.mm.ui.conversation.MainUI) h17).G;
                if (mainUIView != null) {
                    mainUIView.a();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MainUI", "Unexpected. Call resumeRequestLayoutForAnimation() failed");
                }
            }
            com.tencent.mm.ui.cf.f198092d.b();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "Unexpecte situation, notifyChattingUIAnimationEnd() failed.");
        }
        com.tencent.mm.ui.NewChattingTabUI.c(agVar.f197134a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.ag agVar = this.f212588a;
        com.tencent.mm.ui.NewChattingTabUI.b(agVar.f197134a);
        agVar.f197134a.o(false, 0);
    }
}
