package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class u1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.y1 f139304d;

    public u1(com.tencent.mm.plugin.game.chatroom.view.y1 y1Var) {
        this.f139304d = y1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.plugin.game.chatroom.view.y1 y1Var = this.f139304d;
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f139358d.f138947q.getLayoutParams();
        layoutParams.width = intValue;
        y1Var.f139358d.f138947q.setLayoutParams(layoutParams);
        y1Var.f139358d.f138947q.setAlpha(intValue / r0.A);
    }
}
