package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116770d;

    public w4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2) {
        this.f116770d = finderLiveFloatContainerV2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "animateToPosition onAnimationEnd");
        this.f116770d.f115888v = null;
    }
}
