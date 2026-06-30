package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class u4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f174342d;

    public u4(yz5.a aVar) {
        this.f174342d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f174342d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
