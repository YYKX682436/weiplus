package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class u4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190678d;

    public u4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190678d = chatFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f190678d.f190027n.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190678d;
        boolean z17 = chatFooter.f189995h3;
        if (!z17) {
            chatFooter.f190027n.setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "animHideSendBtn onAnimationEnd!! cansend change:%s", java.lang.Boolean.valueOf(z17));
            chatFooter.t();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f190678d.f190027n.setVisibility(0);
    }
}
