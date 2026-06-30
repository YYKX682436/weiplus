package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vk implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f136253e;

    public vk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, float f17) {
        this.f136252d = blVar;
        this.f136253e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) this.f136252d.findViewById(com.tencent.mm.R.id.nuq);
        if (finderEdgeTransparentView != null) {
            finderEdgeTransparentView.setEdgeWidth(animatedFraction * this.f136253e);
        }
    }
}
