package o06;

/* loaded from: classes15.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.c1 f341926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(o06.c1 c1Var) {
        super(1);
        this.f341926d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.m mVar;
        o06.y0 y0Var = (o06.y0) obj;
        kotlin.jvm.internal.o.g(y0Var, "<name for destructuring parameter 0>");
        n16.b bVar = y0Var.f342006a;
        if (bVar.f334158c) {
            throw new java.lang.UnsupportedOperationException("Unresolved local class: " + bVar);
        }
        n16.b g17 = bVar.g();
        o06.c1 c1Var = this.f341926d;
        java.util.List list = y0Var.f342007b;
        if (g17 == null || (mVar = c1Var.a(g17, kz5.n0.R(list, 1))) == null) {
            e26.v vVar = c1Var.f341936c;
            n16.c h17 = bVar.h();
            kotlin.jvm.internal.o.f(h17, "getPackageFqName(...)");
            mVar = (o06.i) ((e26.r) vVar).invoke(h17);
        }
        o06.m mVar2 = mVar;
        boolean k17 = bVar.k();
        e26.c0 c0Var = c1Var.f341934a;
        n16.g j17 = bVar.j();
        kotlin.jvm.internal.o.f(j17, "getShortClassName(...)");
        java.lang.Integer num = (java.lang.Integer) kz5.n0.Z(list);
        return new o06.z0(c0Var, mVar2, j17, k17, num != null ? num.intValue() : 0);
    }
}
