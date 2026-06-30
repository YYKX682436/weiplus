package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class b5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116206e;

    public b5(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2, yz5.a aVar) {
        this.f116205d = finderLiveFloatContainerV2;
        this.f116206e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "showStatePanel: animation end");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2 = this.f116205d;
        finderLiveFloatContainerV2.f115887u = null;
        finderLiveFloatContainerV2.setAlpha(1.0f);
        finderLiveFloatContainerV2.f115881o = false;
        yz5.a aVar = this.f116206e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
