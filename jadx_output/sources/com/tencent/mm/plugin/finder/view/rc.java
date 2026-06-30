package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rc implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation.AnimationListener f132939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132940b;

    public rc(yz5.a aVar) {
        this.f132940b = aVar;
        if (!android.view.animation.Animation.AnimationListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.view.animation.Animation.AnimationListener.class.getClassLoader(), new java.lang.Class[]{android.view.animation.Animation.AnimationListener.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.animation.Animation.AnimationListener");
        }
        this.f132939a = (android.view.animation.Animation.AnimationListener) newProxyInstance;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        yz5.a aVar = this.f132940b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        this.f132939a.onAnimationRepeat(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f132939a.onAnimationStart(animation);
    }
}
