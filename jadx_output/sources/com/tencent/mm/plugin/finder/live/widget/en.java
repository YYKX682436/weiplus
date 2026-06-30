package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class en extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f118271e;

    public en(com.tencent.mm.plugin.finder.live.widget.mn mnVar, float f17) {
        this.f118270d = mnVar;
        this.f118271e = f17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118270d;
        mnVar.f119083d.setTranslationX(this.f118271e);
        mnVar.f119083d.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118270d;
        mnVar.f119083d.setTranslationX(this.f118271e);
        mnVar.f119083d.setVisibility(8);
    }
}
