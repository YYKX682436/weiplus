package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208203a;

    public w(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f208203a = baseConversationUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208203a;
        baseConversationUI.isAnimating = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "klem animationEnd");
        com.tencent.mm.ui.cf.f198092d.b();
        com.tencent.mm.ui.conversation.BaseConversationUI.access$900(baseConversationUI);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        long j17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208203a;
        j17 = baseConversationUI.onDrawStart;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "klem onAnimationStart onDrawed->onAnimationStart:%sms", java.lang.Long.valueOf(currentTimeMillis - j17));
        baseConversationUI.isAnimating = true;
        com.tencent.mm.ui.conversation.BaseConversationUI.access$800(baseConversationUI);
        baseConversationUI.T6(false, 0);
    }
}
