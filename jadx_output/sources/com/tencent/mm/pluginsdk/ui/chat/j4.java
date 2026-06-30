package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class j4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190431d;

    public j4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190431d = chatFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190431d;
        chatFooter.f189956a4.getLayoutParams().height = intValue;
        chatFooter.f189956a4.requestLayout();
    }
}
