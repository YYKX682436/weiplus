package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.s0 f150079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f150080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.multitalk.model.s0 s0Var, boolean z17) {
        super(0);
        this.f150079d = s0Var;
        this.f150080e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.s0 s0Var = this.f150079d;
        s0Var.g();
        if (this.f150080e) {
            com.tencent.mm.app.w.INSTANCE.b(s0Var.f150124s);
        }
        return jz5.f0.f302826a;
    }
}
