package uv0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(uv0.u uVar) {
        super(1);
        this.f431340d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.Timeline D;
        float floatValue = ((java.lang.Number) obj).floatValue();
        uv0.u uVar = this.f431340d;
        uVar.J();
        uv0.i iVar = uVar.U;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            com.tencent.maas.moviecomposing.segments.Segment segment = hVar.f431335c.f257167a;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null && (D = clipSegment.D()) != null) {
                com.tencent.maas.moviecomposing.segments.ClipSegment.G0(clipSegment, floatValue, D);
            }
            hVar.f431334b.p7().c7();
        }
        uVar.K = floatValue;
        uv0.u.O(uVar, floatValue);
        return jz5.f0.f302826a;
    }
}
