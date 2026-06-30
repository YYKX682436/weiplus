package rv0;

/* loaded from: classes5.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f400353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ex0.r rVar, rv0.n1 n1Var, rv0.o7 o7Var) {
        super(0);
        this.f400351d = rVar;
        this.f400352e = n1Var;
        this.f400353f = o7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ex0.r rVar = this.f400351d;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            yy0.m7 m7Var = (yy0.m7) this.f400352e.R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.p3(m7Var, null), 3, null);
            float C = cVar.C() * 100;
            if (C < 0.0f) {
                C = 0.0f;
            }
            if (C > 100.0f) {
                C = 100.0f;
            }
            rv0.o7 o7Var = this.f400353f;
            o7Var.setVolume(C);
            o7Var.setIsMuted(cVar.D());
        }
        return jz5.f0.f302826a;
    }
}
