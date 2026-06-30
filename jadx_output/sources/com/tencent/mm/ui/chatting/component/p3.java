package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u3 f199669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f199671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.ui.chatting.component.u3 u3Var, int i17, java.lang.Long l17) {
        super(0);
        this.f199669d = u3Var;
        this.f199670e = i17;
        this.f199671f = l17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.component.u3 u3Var = this.f199669d;
        if (u3Var.f200048e && this.f199670e == 1 && kotlin.jvm.internal.o.b(u3Var.f200050g, this.f199671f)) {
            u3Var.m0("liveInfoUpdate");
        }
        return jz5.f0.f302826a;
    }
}
