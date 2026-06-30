package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var) {
        super(3);
        this.f134917d = q4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.l13 resp = (r45.l13) obj;
        java.lang.String md52 = (java.lang.String) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlinx.coroutines.y0 lifecycleScope = this.f134917d.getLifecycleScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.viewmodel.component.j4(resp, md52, intValue, this.f134917d, null), 2, null);
        return jz5.f0.f302826a;
    }
}
