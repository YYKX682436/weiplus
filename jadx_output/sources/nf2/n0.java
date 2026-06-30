package nf2;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nf2.d1 d1Var) {
        super(2);
        this.f336782d = d1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar = new jz5.l(java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()), java.lang.Float.valueOf(((java.lang.Number) obj2).floatValue()));
        nf2.d1 d1Var = this.f336782d;
        d1Var.D = lVar;
        nf2.d1.a(d1Var);
        return jz5.f0.f302826a;
    }
}
