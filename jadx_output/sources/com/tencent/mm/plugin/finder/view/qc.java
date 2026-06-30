package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qc implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation.AnimationListener f132887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderJumpAnchorView f132889c;

    public qc(yz5.a aVar, com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView) {
        this.f132888b = aVar;
        this.f132889c = finderJumpAnchorView;
        if (!android.view.animation.Animation.AnimationListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.view.animation.Animation.AnimationListener.class.getClassLoader(), new java.lang.Class[]{android.view.animation.Animation.AnimationListener.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.animation.Animation.AnimationListener");
        }
        this.f132887a = (android.view.animation.Animation.AnimationListener) newProxyInstance;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        yz5.a aVar = this.f132888b;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f132889c.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        this.f132887a.onAnimationRepeat(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f132887a.onAnimationStart(animation);
    }
}
