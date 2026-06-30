package i06;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f286659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(i06.k0 k0Var) {
        super(0);
        this.f286659d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.k0 k0Var = this.f286659d;
        java.util.List<o06.e2> typeParameters = k0Var.l().getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(typeParameters, 10));
        for (o06.e2 e2Var : typeParameters) {
            kotlin.jvm.internal.o.d(e2Var);
            arrayList.add(new i06.y3(k0Var, e2Var));
        }
        return arrayList;
    }
}
