package com.tencent.mm.plugin.finder.view;

/* renamed from: com.tencent.mm.plugin.finder.view.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132304e;

    public Cif(yz5.l lVar, yz5.l lVar2) {
        this.f132303d = lVar;
        this.f132304e = lVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f132303d.invoke(java.lang.Float.valueOf(0.8f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f132304e.invoke(java.lang.Float.valueOf(0.5f));
    }
}
