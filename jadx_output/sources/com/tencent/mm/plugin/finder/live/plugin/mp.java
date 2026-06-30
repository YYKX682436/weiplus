package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mp extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f113553d;

    public mp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        this.f113553d = dqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f113553d.K0(8);
    }
}
