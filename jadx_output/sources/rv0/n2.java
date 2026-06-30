package rv0;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(ex0.a0 a0Var) {
        super(0);
        this.f400139d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.moviecomposing.Timeline D;
        java.util.Iterator it = ((java.util.ArrayList) this.f400139d.f257097g.f257177e).iterator();
        while (it.hasNext()) {
            com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.r) it.next()).f257167a;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null && (D = clipSegment.D()) != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.L0(clipSegment, D);
            }
        }
        return jz5.f0.f302826a;
    }
}
