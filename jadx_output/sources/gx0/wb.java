package gx0;

/* loaded from: classes5.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f277130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f277131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(gx0.ac acVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f277129d = acVar;
        this.f277130e = h0Var;
        this.f277131f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.q vm6 = (ex0.q) obj;
        kotlin.jvm.internal.o.g(vm6, "vm");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = vm6.f257162q;
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.NarrationSegment.N1(narrationSegment, D);
        }
        vm6.H();
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment.D();
        java.lang.String N1 = D2 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.N1(narrationSegment, D2) : null;
        if (N1 != null) {
            narrationSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D3 = narrationSegment.D();
            java.lang.String z17 = D3 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.z1(narrationSegment, D3) : null;
            if (z17 != null) {
                com.tencent.maas.moviecomposing.segments.Segment segment = vm6.f257167a;
                kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                this.f277129d.h8((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment, N1, z17);
                kotlin.jvm.internal.h0 h0Var = this.f277130e;
                if (h0Var.f310123d == null) {
                    h0Var.f310123d = N1;
                }
                if (!kotlin.jvm.internal.o.b(h0Var.f310123d, N1)) {
                    this.f277131f.f310112d = true;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
