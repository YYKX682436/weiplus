package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.g1 f134314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var) {
        super(0);
        this.f134314d = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = this.f134314d;
        g1Var.f134456e = false;
        g1Var.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
