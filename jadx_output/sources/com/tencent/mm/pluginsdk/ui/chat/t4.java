package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class t4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190664d;

    public t4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190664d = chatFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190664d;
        android.view.ViewGroup.LayoutParams layoutParams = chatFooter.f190027n.getLayoutParams();
        layoutParams.width = intValue;
        chatFooter.f190027n.setLayoutParams(layoutParams);
        int i17 = chatFooter.R5;
        chatFooter.f190027n.setAlpha((intValue - i17) / (chatFooter.Q5 - i17));
        chatFooter.Y0(java.lang.Boolean.FALSE);
    }
}
