package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(2);
        this.f116365d = k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f116365d;
        if (booleanValue) {
            if2.z.f291153a.f(k0Var.getData().f309131f);
            qo0.c.a(k0Var, qo0.b.f365405q4, null, 2, null);
        } else {
            if2.z.f291153a.g(k0Var.getData().f309131f);
            qo0.c.a(k0Var, qo0.b.f365409r4, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
