package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        super(2);
        this.f159951d = t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        yz5.l callback = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159951d;
        t0Var.g(new com.tencent.mm.plugin.scanner.view.j0(t0Var, intValue, callback));
        return jz5.f0.f302826a;
    }
}
