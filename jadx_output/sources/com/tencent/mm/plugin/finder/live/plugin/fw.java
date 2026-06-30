package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fw extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f112596e;

    public fw(com.tencent.mm.plugin.finder.live.plugin.ow owVar, android.widget.ImageView imageView) {
        this.f112595d = owVar;
        this.f112596e = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f112595d.B1().removeView(this.f112596e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f112595d.B1().removeView(this.f112596e);
    }
}
