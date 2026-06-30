package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class aw extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f111942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f111943e;

    public aw(com.tencent.mm.plugin.finder.live.plugin.ow owVar, android.widget.ImageView imageView) {
        this.f111942d = owVar;
        this.f111943e = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f111942d.B1().removeView(this.f111943e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f111942d.B1().removeView(this.f111943e);
    }
}
