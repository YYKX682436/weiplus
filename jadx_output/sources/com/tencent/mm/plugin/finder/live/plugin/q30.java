package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q30 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r30 f113956d;

    public q30(com.tencent.mm.plugin.finder.live.plugin.r30 r30Var) {
        this.f113956d = r30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = this.f113956d;
        r30Var.f365323d.setVisibility(8);
        yz5.a aVar = r30Var.f114082v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = this.f113956d;
        r30Var.f365323d.setVisibility(8);
        yz5.a aVar = r30Var.f114082v;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
