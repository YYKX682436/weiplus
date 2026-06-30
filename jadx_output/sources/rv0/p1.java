package rv0;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f400174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(xv0.g gVar, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, rv0.n1 n1Var) {
        super(2);
        this.f400173d = gVar;
        this.f400174e = clipSegment;
        this.f400175f = n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xv0.b type = (xv0.b) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.o.g(type, "type");
        this.f400173d.J();
        int ordinal = type.ordinal();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f400174e;
        if (ordinal == 0) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.O0(clipSegment, floatValue, D);
            }
        } else if (ordinal == 1) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
            if (D2 != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.R0(clipSegment, floatValue, D2);
            }
        } else if (ordinal == 2) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D3 = clipSegment.D();
            if (D3 != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.S0(clipSegment, floatValue, D3);
            }
        } else if (ordinal == 3) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D4 = clipSegment.D();
            if (D4 != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.j1(clipSegment, floatValue, D4);
            }
        } else if (ordinal == 4) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D5 = clipSegment.D();
            if (D5 != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.l1(clipSegment, floatValue, D5);
            }
        } else if (ordinal == 5) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D6 = clipSegment.D();
            if (D6 != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.N0(clipSegment, floatValue, D6);
            }
        }
        this.f400175f.p7().c7();
        return jz5.f0.f302826a;
    }
}
