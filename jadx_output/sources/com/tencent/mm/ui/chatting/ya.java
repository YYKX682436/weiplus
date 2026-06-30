package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class ya implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f206265d;

    public ya(com.tencent.mm.ui.chatting.db dbVar) {
        this.f206265d = dbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.ui.chatting.db dbVar = this.f206265d;
        int i17 = dbVar.f200426f;
        ((com.tencent.mm.ui.chatting.ta) dbVar.f200425e).b((int) (i17 * floatValue), i17);
    }
}
