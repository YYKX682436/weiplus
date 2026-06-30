package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.a f153910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var, r61.a aVar) {
        super(0);
        this.f153909d = k1Var;
        this.f153910e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = this.f153909d.f153945t;
        java.lang.String h17 = this.f153910e.h();
        kotlin.jvm.internal.o.f(h17, "getRealName(...)");
        ((java.util.ArrayList) list).add(h17);
        return jz5.f0.f302826a;
    }
}
