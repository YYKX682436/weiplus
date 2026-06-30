package y;

/* loaded from: classes14.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.h1 f458326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(y.h1 h1Var, long j17) {
        super(1);
        this.f458326d = h1Var;
        this.f458327e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        long j18;
        y.g0 it = (y.g0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        y.h1 h1Var = this.f458326d;
        h1Var.getClass();
        y.u uVar = (y.u) h1Var.f458359f.getValue();
        long j19 = this.f458327e;
        if (uVar != null) {
            j17 = ((p2.q) uVar.f458450b.invoke(new p2.q(j19))).f351396a;
        } else {
            j17 = j19;
        }
        y.u uVar2 = (y.u) h1Var.f458360g.getValue();
        if (uVar2 != null) {
            j18 = ((p2.q) uVar2.f458450b.invoke(new p2.q(j19))).f351396a;
        } else {
            j18 = j19;
        }
        int ordinal = it.ordinal();
        if (ordinal == 0) {
            j19 = j17;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            j19 = j18;
        }
        return new p2.q(j19);
    }
}
