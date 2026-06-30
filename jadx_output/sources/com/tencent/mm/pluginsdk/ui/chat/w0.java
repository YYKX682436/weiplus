package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class w0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f190699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f190700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190701f;

    public w0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, float f17, float f18) {
        this.f190701f = chatFooter;
        this.f190699d = f17;
        this.f190700e = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190701f;
        chatFooter.L4.setProgress(this.f190699d - floatValue);
        chatFooter.L4.setStartAngle(this.f190700e + floatValue);
        chatFooter.K4.setProgress(4.0f - floatValue);
        chatFooter.K4.setStartAngle((floatValue * 2.0f) + 252.0f);
    }
}
