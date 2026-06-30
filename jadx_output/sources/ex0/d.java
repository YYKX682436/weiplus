package ex0;

/* loaded from: classes5.dex */
public final class d extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.ContentDescSegment f257121p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment) {
        super(contentDescSegment);
        kotlin.jvm.internal.o.g(contentDescSegment, "contentDescSegment");
        this.f257121p = contentDescSegment;
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.62f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.65f);
    }
}
