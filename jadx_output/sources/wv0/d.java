package wv0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f449901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv0.q f449902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ex0.a0 a0Var, wv0.q qVar) {
        super(2);
        this.f449901d = a0Var;
        this.f449902e = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vv0.n segment = (vv0.n) obj;
        vv0.n beforeSegment = (vv0.n) obj2;
        kotlin.jvm.internal.o.g(segment, "segment");
        kotlin.jvm.internal.o.g(beforeSegment, "beforeSegment");
        ex0.a0 a0Var = this.f449901d;
        a0Var.getClass();
        com.tencent.maas.base.MJID segmentID = segment.f440398a;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.maas.base.MJID beforeSegmentID = beforeSegment.f440398a;
        kotlin.jvm.internal.o.g(beforeSegmentID, "beforeSegmentID");
        a0Var.f257092b.v(segmentID, beforeSegmentID);
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224510f);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        a0Var.J(of6, null);
        this.f449902e.J();
        return jz5.f0.f302826a;
    }
}
