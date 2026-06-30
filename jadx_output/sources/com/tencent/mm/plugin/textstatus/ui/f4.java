package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes14.dex */
public final class f4 extends sa5.f {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f173861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(yz5.l update) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(update, "update");
        this.f173861f = update;
        this.f405349b = new sa5.p(0.0f, 0.0f, null, sa5.r.f405369a, 4, null);
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f173861f.invoke(java.lang.Float.valueOf(animation.getAnimatedFraction()));
    }
}
