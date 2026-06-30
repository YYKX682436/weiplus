package yx;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f467045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.y f467046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jy.m mVar, xx.y yVar) {
        super(2);
        this.f467045d = mVar;
        this.f467046e = yVar;
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
        yx.q0.d(this.f467045d, this.f467046e, null, oVar, 72, 4);
        return jz5.f0.f302826a;
    }
}
