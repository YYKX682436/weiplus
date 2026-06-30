package i06;

/* loaded from: classes15.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f286787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f286786d = f1Var;
        this.f286787e = k1Var;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        o06.g a17 = this.f286786d.a();
        if (a17.j() != o06.h.f341965i) {
            return null;
        }
        boolean g07 = a17.g0();
        i06.k1 k1Var = this.f286787e;
        java.lang.Object obj = ((!g07 || l06.f.a(l06.e.f314879a, a17)) ? k1Var.f286680e.getDeclaredField("INSTANCE") : k1Var.f286680e.getEnclosingClass().getDeclaredField(a17.getName().h())).get(null);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
        return obj;
    }
}
