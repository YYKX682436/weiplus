package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(0);
        this.f112729d = etVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f112729d;
        r45.ze2 ze2Var = etVar.f112447l1;
        if (ze2Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.et.u1(etVar, ze2Var);
        } else {
            ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
            com.tencent.mm.plugin.finder.live.plugin.et.v1(etVar, ((java.lang.Number) k0Var.P6().f302833d).floatValue(), ((java.lang.Number) k0Var.P6().f302834e).floatValue());
        }
        return jz5.f0.f302826a;
    }
}
