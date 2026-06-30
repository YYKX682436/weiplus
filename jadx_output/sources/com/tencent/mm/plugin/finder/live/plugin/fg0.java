package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class fg0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f112552d;

    public fg0(yz5.a aVar) {
        this.f112552d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f112552d.invoke();
    }
}
