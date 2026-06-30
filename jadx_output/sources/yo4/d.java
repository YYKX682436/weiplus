package yo4;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f464190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ju3.d0 d0Var, yo4.p pVar) {
        super(1);
        this.f464190d = d0Var;
        this.f464191e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yo4.p pVar = this.f464191e;
        ju3.d0 d0Var = this.f464190d;
        if (booleanValue) {
            ju3.d0.k(d0Var, ju3.c0.S, null, 2, null);
            pVar.f464292w = -1L;
        } else {
            ju3.d0.k(d0Var, ju3.c0.W, null, 2, null);
            ju3.c0 c0Var = ju3.c0.T;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", pVar.f464292w);
            d0Var.w(c0Var, bundle);
        }
        return jz5.f0.f302826a;
    }
}
