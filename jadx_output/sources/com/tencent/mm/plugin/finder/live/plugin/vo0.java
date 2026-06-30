package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class vo0 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114808d;

    public vo0(yz5.a aVar) {
        this.f114808d = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f114808d.invoke();
    }
}
