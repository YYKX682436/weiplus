package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class f0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190303d;

    public f0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190303d = chatFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190303d;
        chatFooter.f190027n.setVisibility(0);
        chatFooter.f190103z.setVisibility(8);
        chatFooter.r1(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190303d;
        if (!chatFooter.U3) {
            android.view.ViewGroup.LayoutParams layoutParams = chatFooter.f190027n.getLayoutParams();
            layoutParams.width = -2;
            chatFooter.f190027n.setLayoutParams(layoutParams);
        }
        chatFooter.f190103z.setVisibility(8);
        chatFooter.r1(false);
        boolean z17 = chatFooter.f189995h3;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "animShowSendBtn onAnimationEnd!! cansend change:%s", java.lang.Boolean.valueOf(z17));
            chatFooter.f190103z.setVisibility(0);
            chatFooter.r1(true);
            chatFooter.s();
        }
        chatFooter.f190021m.h();
        chatFooter.post(new com.tencent.mm.pluginsdk.ui.chat.e0(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190303d;
        chatFooter.f190027n.setVisibility(0);
        chatFooter.f190021m.getSizeAnimController().a(false);
    }
}
