package rv0;

/* loaded from: classes5.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f399921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(rv0.o7 o7Var, ex0.r rVar, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(2);
        this.f399921d = o7Var;
        this.f399922e = rVar;
        this.f399923f = n1Var;
        this.f399924g = a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (((java.lang.Boolean) obj2).booleanValue()) {
            this.f399921d.J();
            ex0.r rVar = this.f399922e;
            ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
            if (cVar != null) {
                cVar.E(floatValue);
                boolean z17 = floatValue == 0.0f;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = cVar.f257119p;
                clipSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.I0(clipSegment, z17, D);
                }
                ex0.a0 a0Var = this.f399924g;
                rv0.n1 n1Var = this.f399923f;
                rv0.a4.a(a0Var, n1Var);
                n1Var.p7().c7();
            }
        }
        return jz5.f0.f302826a;
    }
}
