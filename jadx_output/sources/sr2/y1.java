package sr2;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(sr2.y2 y2Var) {
        super(0);
        this.f411799d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ya2.p1 p1Var = this.f411799d.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        yv2.b bVar = (yv2.b) p1Var;
        if (!bVar.f466206o) {
            bVar.f466205n = true;
            bVar.a().c();
        }
        return jz5.f0.f302826a;
    }
}
