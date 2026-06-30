package rv0;

/* loaded from: classes5.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f399935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(rv0.o7 o7Var, ex0.r rVar, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(0);
        this.f399935d = o7Var;
        this.f399936e = rVar;
        this.f399937f = n1Var;
        this.f399938g = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.o7 o7Var = this.f399935d;
        o7Var.J();
        ex0.r rVar = this.f399936e;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            boolean z17 = !cVar.D();
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = cVar.f257119p;
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.I0(clipSegment, z17, D);
            }
            o7Var.setIsMuted(z17);
            ex0.a0 a0Var = this.f399938g;
            rv0.n1 n1Var = this.f399937f;
            rv0.a4.a(a0Var, n1Var);
            n1Var.p7().c7();
        }
        return jz5.f0.f302826a;
    }
}
