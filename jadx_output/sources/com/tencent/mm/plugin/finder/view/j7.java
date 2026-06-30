package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class j7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132420e;

    public j7(yz5.a aVar, yz5.a aVar2) {
        this.f132419d = aVar;
        this.f132420e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f132420e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f132419d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
