package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class v3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190691d;

    public v3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190691d = chatFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190691d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) chatFooter.R4.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) chatFooter.S4.getLayoutParams();
        if (chatFooter.f190019l5 == valueAnimator) {
            layoutParams.width = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.width = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f190025m5 == valueAnimator) {
            layoutParams.height = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.height = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f190031n5 == valueAnimator) {
            layoutParams.topMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.topMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f190037o5 == valueAnimator) {
            layoutParams.rightMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.rightMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f190045p5 == valueAnimator) {
            layoutParams.bottomMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.bottomMargin = com.tencent.mm.ui.zk.a(chatFooter.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        chatFooter.R4.setLayoutParams(layoutParams);
        chatFooter.S4.setLayoutParams(layoutParams2);
    }
}
