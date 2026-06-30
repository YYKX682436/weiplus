package y;

/* loaded from: classes14.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.x1 f458457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(y.x1 x1Var, long j17) {
        super(1);
        this.f458457d = x1Var;
        this.f458458e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        yz5.l lVar2;
        y.g0 it = (y.g0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        y.x1 x1Var = this.f458457d;
        x1Var.getClass();
        y.t1 t1Var = (y.t1) x1Var.f458475e.getValue();
        long j17 = this.f458458e;
        long j18 = (t1Var == null || (lVar2 = t1Var.f458447a) == null) ? p2.m.f351388b : ((p2.m) lVar2.invoke(new p2.q(j17))).f351390a;
        y.t1 t1Var2 = (y.t1) x1Var.f458476f.getValue();
        long j19 = (t1Var2 == null || (lVar = t1Var2.f458447a) == null) ? p2.m.f351388b : ((p2.m) lVar.invoke(new p2.q(j17))).f351390a;
        int ordinal = it.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                j18 = p2.m.f351388b;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                j18 = j19;
            }
        }
        return new p2.m(j18);
    }
}
