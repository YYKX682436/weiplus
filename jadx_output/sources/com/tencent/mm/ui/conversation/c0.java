package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class c0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f207597a;

    public c0(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f207597a = baseConversationUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        gm0.j1.e().o();
        com.tencent.mm.sdk.platformtools.u3.m(0);
        this.f207597a.U6();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationEnd");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        gm0.j1.e().p();
        com.tencent.mm.sdk.platformtools.u3.m(-8);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationStart");
        this.f207597a.T6(true, 0);
    }
}
