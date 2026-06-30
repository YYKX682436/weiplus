package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190457d;

    public l0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190457d = chatFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f190457d.f189956a4.setTranslationX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
