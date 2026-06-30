package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.n0 f190480d;

    public m0(com.tencent.mm.pluginsdk.ui.chat.n0 n0Var) {
        this.f190480d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.n0 n0Var = this.f190480d;
        n0Var.f190494d.f189984f4.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = n0Var.f190494d;
        chatFooter.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "playAutoBubbleEnterAnimate ");
        float dimensionPixelSize = chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479664c2);
        chatFooter.f189956a4.setScaleX(1.0f);
        chatFooter.f189956a4.setScaleY(1.0f);
        chatFooter.f189956a4.setTranslationY(dimensionPixelSize);
        chatFooter.f189978e4.setTranslationY(dimensionPixelSize);
        float dimensionPixelSize2 = chatFooter.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "translationY", dimensionPixelSize2, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189956a4, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189978e4, "translationY", dimensionPixelSize2, 0.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(chatFooter.f189978e4, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
    }
}
