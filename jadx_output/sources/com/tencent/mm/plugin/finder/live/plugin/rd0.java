package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f114127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        super(0);
        this.f114127d = de0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object value = ((jz5.n) this.f114127d.B).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.animation.ObjectAnimator) value).start();
        return jz5.f0.f302826a;
    }
}
