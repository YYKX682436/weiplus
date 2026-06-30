package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f149880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f149881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.multitalk.model.b3 b3Var, yz5.q qVar) {
        super(0);
        this.f149880d = b3Var;
        this.f149881e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f149880d;
        os0.c cVar = b3Var.f149896i;
        if (cVar != null) {
            cVar.f348010s = new com.tencent.mm.plugin.multitalk.model.z2(this.f149881e, b3Var);
        }
        return jz5.f0.f302826a;
    }
}
