package iy;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f295677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jy.m mVar) {
        super(2);
        this.f295677d = mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        ky.l0.a(ky.h0.f313367e, oVar, 6, 0);
        iy.n.a(this.f295677d, null, oVar, 8, 2);
        return jz5.f0.f302826a;
    }
}
