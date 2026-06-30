package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class u4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f116707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116708e;

    public u4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer, yz5.a aVar) {
        this.f116707d = finderLiveFloatContainer;
        this.f116708e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f116707d.bringToFront();
        yz5.a aVar = this.f116708e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f116707d.bringToFront();
        yz5.a aVar = this.f116708e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
