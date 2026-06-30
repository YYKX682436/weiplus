package i06;

/* loaded from: classes15.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f286626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f286625d = f1Var;
        this.f286626e = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<o06.e2> m17 = this.f286625d.a().m();
        kotlin.jvm.internal.o.f(m17, "getDeclaredTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        for (o06.e2 e2Var : m17) {
            kotlin.jvm.internal.o.d(e2Var);
            arrayList.add(new i06.y3(this.f286626e, e2Var));
        }
        return arrayList;
    }
}
