package tv0;

/* loaded from: classes5.dex */
public final class o implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f422227a = com.tencent.maas.model.time.MJTime.ZeroTime;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f422228b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f422229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f422232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView f422233g;

    public o(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, tv0.j0 j0Var, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView) {
        this.f422230d = clipSegment;
        this.f422231e = j0Var;
        this.f422232f = a0Var;
        this.f422233g = cropMaterialTimelineView;
        this.f422228b = clipSegment.z().sub(new com.tencent.maas.model.time.MJTime(1L));
        this.f422229c = clipSegment.B().getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L));
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (tv0.m.f422217a[source.ordinal()] != 1) {
            kotlinx.coroutines.l.d(this.f422231e.getMainScope(), null, null, new tv0.n(this.f422231e, d17, this.f422232f, this.f422233g, this, this.f422230d, null), 3, null);
        }
    }
}
