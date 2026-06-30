package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vv implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f114822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f114824f;

    public vv(com.tencent.mm.plugin.finder.live.plugin.ow owVar, yz5.a aVar, kotlinx.coroutines.q qVar) {
        this.f114822d = owVar;
        this.f114823e = aVar;
        this.f114824f = qVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.String str = this.f114822d.f113787p;
        this.f114823e.invoke();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f114824f.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
