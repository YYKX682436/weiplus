package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190756d;

    public y0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190756d = chatFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190756d;
        chatFooter.Z3.setBackground(chatFooter.s0(chatFooter.Y5 - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), chatFooter.Z5 - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
