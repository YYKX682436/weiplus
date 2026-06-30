package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class r5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentEditText f132930f;

    public r5(yz5.a aVar, yz5.a aVar2, com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText) {
        this.f132928d = aVar;
        this.f132929e = aVar2;
        this.f132930f = finderCommentEditText;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f132929e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f132928d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f132930f.setHint("");
    }
}
