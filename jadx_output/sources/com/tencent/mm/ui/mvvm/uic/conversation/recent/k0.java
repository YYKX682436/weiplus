package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f209341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wi5.n0 n0Var) {
        super(1);
        this.f209341d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (ri5.j jVar : it) {
            wi5.n0 n0Var = this.f209341d;
            jVar.f396127x = n0Var.e();
            jVar.f396126w = n0Var.f(jVar.f396111f);
        }
        return jz5.f0.f302826a;
    }
}
