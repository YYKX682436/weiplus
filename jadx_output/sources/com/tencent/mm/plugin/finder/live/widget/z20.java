package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f120514d;

    public z20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        this.f120514d = e30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f120514d.f118221z.setVisibility(8);
    }
}
