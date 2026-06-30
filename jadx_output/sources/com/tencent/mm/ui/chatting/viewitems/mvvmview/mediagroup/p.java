package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes14.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f204839e;

    public p(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView, android.animation.ValueAnimator valueAnimator) {
        this.f204838d = chattingMediaGroupMvvmView;
        this.f204839e = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = this.f204839e.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float[] fArr = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView.K;
        this.f204838d.k(floatValue);
    }
}
