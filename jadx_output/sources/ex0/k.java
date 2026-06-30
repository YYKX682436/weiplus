package ex0;

/* loaded from: classes5.dex */
public final class k extends ex0.f implements bu0.a {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.FancyTextSegment f257144p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment) {
        super(fancyTextSegment);
        kotlin.jvm.internal.o.g(fancyTextSegment, "fancyTextSegment");
        this.f257144p = fancyTextSegment;
    }

    @Override // bu0.a
    public java.lang.String a() {
        com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = this.f257144p;
        fancyTextSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
        return D != null ? com.tencent.maas.moviecomposing.segments.FancyTextSegment.M0(fancyTextSegment, D) : "";
    }

    @Override // bu0.a
    public boolean c(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = this.f257144p;
        fancyTextSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.FancyTextSegment.J0(fancyTextSegment, materialID, D);
        }
        return bool.booleanValue();
    }

    @Override // bu0.a
    public java.lang.String d() {
        com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = this.f257144p;
        fancyTextSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
        return D != null ? com.tencent.maas.moviecomposing.segments.FancyTextSegment.y0(fancyTextSegment, D) : "";
    }
}
