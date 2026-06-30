package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class ra implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202647d;

    public ra(com.tencent.mm.ui.chatting.db dbVar) {
        this.f202647d = dbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = (int) ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.ui.chatting.db dbVar = this.f202647d;
        ((com.tencent.mm.ui.chatting.ta) dbVar.f200425e).b(floatValue, dbVar.f200426f);
    }
}
