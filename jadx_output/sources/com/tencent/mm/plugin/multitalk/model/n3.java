package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.p3 f150053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.multitalk.model.p3 p3Var, com.tencent.mm.plugin.multitalk.model.b3 b3Var) {
        super(0);
        this.f150053d = p3Var;
        this.f150054e = b3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150054e;
        com.tencent.mm.plugin.multitalk.model.e0 e0Var = new com.tencent.mm.plugin.multitalk.model.e0(b3Var.f149890c);
        e0Var.f149933u = new com.tencent.mm.plugin.multitalk.model.m3(b3Var);
        int i18 = e0Var.f149931s;
        if (i18 != 0 && (i17 = e0Var.f149932t) != 0) {
            b3Var.f149894g = i18;
            b3Var.f149895h = i17;
        }
        this.f150053d.f150074g = e0Var;
        return jz5.f0.f302826a;
    }
}
