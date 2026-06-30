package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f113041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        super(0);
        this.f113041d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = (com.tencent.mm.plugin.finder.live.plugin.w0) this.f113041d.X0(com.tencent.mm.plugin.finder.live.plugin.w0.class);
        if (w0Var != null) {
            android.animation.ValueAnimator valueAnimator = w0Var.f114840v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            w0Var.t1();
        }
        return jz5.f0.f302826a;
    }
}
