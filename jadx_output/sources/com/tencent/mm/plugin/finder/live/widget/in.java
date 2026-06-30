package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class in extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118689d;

    public in(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f118689d = mnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118689d;
        if (mnVar.f119098v == 1) {
            mnVar.f119088i.setVisibility(0);
        }
    }
}
