package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class sv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f114310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f114311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(android.animation.AnimatorSet animatorSet, android.animation.ObjectAnimator objectAnimator, yz5.a aVar) {
        super(1);
        this.f114310d = animatorSet;
        this.f114311e = objectAnimator;
        this.f114312f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f114310d.cancel();
        this.f114311e.cancel();
        this.f114312f.invoke();
        return jz5.f0.f302826a;
    }
}
