package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class xr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f133363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f133364e;

    public xr(yz5.a aVar) {
        this.f133364e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        this.f133363d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(a17, "a");
        if (this.f133363d || (aVar = this.f133364e) == null) {
            return;
        }
        aVar.invoke();
    }
}
