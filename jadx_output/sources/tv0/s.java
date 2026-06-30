package tv0;

/* loaded from: classes5.dex */
public final class s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView f422239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f422241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422242g;

    public s(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView, tv0.j0 j0Var, ex0.a0 a0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        this.f422239d = cropMaterialTimelineView;
        this.f422240e = j0Var;
        this.f422241f = a0Var;
        this.f422242g = clipSegment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView = this.f422239d;
        cropMaterialTimelineView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f422240e.x7(cropMaterialTimelineView, this.f422241f, this.f422242g);
    }
}
