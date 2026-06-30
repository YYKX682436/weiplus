package tv0;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView f422218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f422219e;

    public m0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView, double d17) {
        this.f422218d = cropMaterialTimelineView;
        this.f422219e = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView.A;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView = this.f422218d;
        fy0.r scrollHelper = cropMaterialTimelineView.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.c(this.f422219e);
        }
        cropMaterialTimelineView.j();
    }
}
