package uf;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f427028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(uf.o0 o0Var, boolean z17) {
        super(2);
        this.f427027d = o0Var;
        this.f427028e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x91.h hVar = (x91.h) obj;
        ((java.lang.Number) obj2).intValue();
        uf.o0 o0Var = this.f427027d;
        if (hVar == null) {
            o0Var.f427059b.j(false);
            uf.c2 c2Var = o0Var.f427063f;
            if (c2Var == null) {
                kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
                throw null;
            }
            c2Var.f427010w = null;
            c2Var.f();
        } else {
            o0Var.f427068k = uf.a.f426959f;
            o0Var.f427059b.j(true);
            if (this.f427028e) {
                uf.c2 c2Var2 = o0Var.f427063f;
                if (c2Var2 == null) {
                    kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
                    throw null;
                }
                c2Var2.f();
            }
        }
        return jz5.f0.f302826a;
    }
}
