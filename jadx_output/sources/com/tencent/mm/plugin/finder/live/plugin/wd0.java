package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f114921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        super(0);
        this.f114920d = viewGroup;
        this.f114921e = de0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f114920d, "alpha", 0.0f, 1.0f);
        h0Var.f310123d = ofFloat;
        ofFloat.setDuration(300L);
        ((android.animation.ObjectAnimator) h0Var.f310123d).setInterpolator(new android.view.animation.DecelerateInterpolator());
        ((android.animation.ObjectAnimator) h0Var.f310123d).addListener(new com.tencent.mm.plugin.finder.live.plugin.vd0(h0Var, this.f114921e));
        return (android.animation.ObjectAnimator) h0Var.f310123d;
    }
}
