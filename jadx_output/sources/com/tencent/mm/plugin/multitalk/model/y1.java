package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a2 f150210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.multitalk.model.a2 a2Var) {
        super(1);
        this.f150210d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fj3.k a17;
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gj3.h hVar = this.f150210d.f149875a;
        if (hVar != null && (a17 = hVar.a()) != null) {
            a17.a(new hj3.o(it));
        }
        return jz5.f0.f302826a;
    }
}
