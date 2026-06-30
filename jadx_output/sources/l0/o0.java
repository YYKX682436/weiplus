package l0;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.p pVar, int i17) {
        super(2);
        this.f314400d = pVar;
        this.f314401e = i17;
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
        l0.t0.a(this.f314400d, oVar, (this.f314401e >> 9) & 14);
        return jz5.f0.f302826a;
    }
}
