package y;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.h1 f458343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(y.h1 h1Var, long j17) {
        super(1);
        this.f458343d = h1Var;
        this.f458344e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        y.g0 it = (y.g0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long j18 = this.f458344e;
        y.h1 h1Var = this.f458343d;
        h1Var.getClass();
        if (h1Var.f458362i == null) {
            j17 = p2.m.f351388b;
        } else {
            n0.e5 e5Var = h1Var.f458361h;
            if (e5Var.getValue() == null) {
                j17 = p2.m.f351388b;
            } else if (kotlin.jvm.internal.o.b(h1Var.f458362i, e5Var.getValue())) {
                j17 = p2.m.f351388b;
            } else {
                int ordinal = it.ordinal();
                if (ordinal == 0) {
                    j17 = p2.m.f351388b;
                } else if (ordinal == 1) {
                    j17 = p2.m.f351388b;
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    y.u uVar = (y.u) h1Var.f458360g.getValue();
                    if (uVar != null) {
                        long j19 = ((p2.q) uVar.f458450b.invoke(new p2.q(j18))).f351396a;
                        java.lang.Object value = e5Var.getValue();
                        kotlin.jvm.internal.o.d(value);
                        p2.s sVar = p2.s.Ltr;
                        long a17 = ((z0.g) ((z0.d) value)).a(j18, j19, sVar);
                        z0.d dVar = h1Var.f458362i;
                        kotlin.jvm.internal.o.d(dVar);
                        long a18 = ((z0.g) dVar).a(j18, j19, sVar);
                        j17 = p2.n.a(((int) (a17 >> 32)) - ((int) (a18 >> 32)), p2.m.b(a17) - p2.m.b(a18));
                    } else {
                        j17 = p2.m.f351388b;
                    }
                }
            }
        }
        return new p2.m(j17);
    }
}
