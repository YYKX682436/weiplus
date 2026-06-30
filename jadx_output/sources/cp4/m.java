package cp4;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f221048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cp4.r rVar) {
        super(2);
        this.f221048d = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        r45.is result = (r45.is) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        cp4.r rVar = this.f221048d;
        rVar.f221074y++;
        rVar.f221058f.setShow(false);
        ju3.c0 c0Var = ju3.c0.f301895p1;
        ju3.d0 d0Var = rVar.f465332d;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
        rVar.I(intValue, result);
        return jz5.f0.f302826a;
    }
}
