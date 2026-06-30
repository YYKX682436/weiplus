package ex0;

/* loaded from: classes5.dex */
public final class j0 extends ex0.r {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.TransitionSegment f257143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment) {
        super(transitionSegment);
        kotlin.jvm.internal.o.g(transitionSegment, "transitionSegment");
        this.f257143f = transitionSegment;
    }

    @Override // ex0.r
    public void q(cx0.b mutationEntry) {
        kotlin.jvm.internal.o.g(mutationEntry, "mutationEntry");
        super.q(mutationEntry);
    }

    public final java.lang.String r() {
        com.tencent.maas.moviecomposing.segments.TransitionDesc I = this.f257143f.I();
        if (I != null) {
            return I.getTransitionID();
        }
        return null;
    }

    public final boolean s() {
        com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment = this.f257143f;
        transitionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = transitionSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.TransitionSegment.G(transitionSegment, D);
        }
        return bool.booleanValue();
    }
}
