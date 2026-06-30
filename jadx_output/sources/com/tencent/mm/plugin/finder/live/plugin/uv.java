package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uv implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f114620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f114621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f114622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114623g;

    public uv(kotlinx.coroutines.q qVar, android.animation.ObjectAnimator objectAnimator, com.tencent.mm.plugin.finder.live.plugin.ow owVar, yz5.a aVar) {
        this.f114620d = qVar;
        this.f114621e = objectAnimator;
        this.f114622f = owVar;
        this.f114623g = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlinx.coroutines.q qVar = this.f114620d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            android.animation.ObjectAnimator objectAnimator = this.f114621e;
            kotlin.jvm.internal.o.d(objectAnimator);
            objectAnimator.addListener(new com.tencent.mm.plugin.finder.live.plugin.vv(this.f114622f, this.f114623g, qVar));
            objectAnimator.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
