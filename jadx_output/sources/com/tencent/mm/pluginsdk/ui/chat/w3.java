package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190705d;

    public w3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190705d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190705d;
        chatFooter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "playAutoBubbleExitAnimate");
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        java.lang.String chatUsername = y4Var != null ? y4Var.c() : "";
        kotlin.jvm.internal.o.g(chatUsername, "chatUsername");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voice_sessionid", u35.d.f424435a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voice_auto_send_after_60s_hold", hashMap, 35963);
        float dimensionPixelSize = chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        float dimensionPixelSize2 = chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479725dh);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "translationY", 0.0f, -dimensionPixelSize);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "scaleX", 1.0f, 0.9f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "scaleY", 1.0f, 0.9f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189978e4, "translationY", 0.0f, -dimensionPixelSize2);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189978e4, "alpha", 1.0f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        animatorSet.addListener(new com.tencent.mm.pluginsdk.ui.chat.n0(chatFooter));
        animatorSet.start();
    }
}
