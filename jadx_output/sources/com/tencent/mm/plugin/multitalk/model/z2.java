package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f150214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yz5.q qVar, com.tencent.mm.plugin.multitalk.model.b3 b3Var) {
        super(1);
        this.f150214d = qVar;
        this.f150215e = b3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.ByteBuffer it = (java.nio.ByteBuffer) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150215e;
        this.f150214d.invoke(it, java.lang.Integer.valueOf(b3Var.f149894g), java.lang.Integer.valueOf(b3Var.f149895h));
        return jz5.f0.f302826a;
    }
}
