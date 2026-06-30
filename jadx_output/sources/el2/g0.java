package el2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(el2.i0 i0Var) {
        super(1);
        this.f253799d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (kz5.c0.i(7, 19).contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
            wt2.a aVar = this.f253799d.I;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            aVar.V3();
        }
        return jz5.f0.f302826a;
    }
}
