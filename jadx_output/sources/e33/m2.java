package e33;

/* loaded from: classes10.dex */
public class m2 implements y51.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem f247355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout f247356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247357c;

    public m2(e33.v2 v2Var, com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem, com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout) {
        this.f247357c = v2Var;
        this.f247355a = galleryItem$LivePhotoMediaItem;
        this.f247356b = galleryLivePhotoTagLayout;
    }

    @Override // y51.d
    public void a(long j17, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "onParseVideoError >> mediaId: %d, errCode: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f247355a.H = 0;
        com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout = this.f247356b;
        if (galleryLivePhotoTagLayout.f138411h == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "changeStateInValid >> " + galleryLivePhotoTagLayout.hashCode() + ", " + galleryLivePhotoTagLayout.f138411h + ", " + galleryLivePhotoTagLayout.f138412i);
        int i18 = galleryLivePhotoTagLayout.f138412i;
        if (i18 == 1 || i18 == 2) {
            galleryLivePhotoTagLayout.b(3);
            com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent = new com.tencent.mm.autogen.events.LivePhotoUseStateEvent();
            am.zi ziVar = livePhotoUseStateEvent.f54476g;
            ziVar.f8567b = false;
            ziVar.f8566a = galleryLivePhotoTagLayout.f138411h;
            ziVar.f8568c = galleryLivePhotoTagLayout.f138407d;
            livePhotoUseStateEvent.e();
        }
    }

    @Override // y51.d
    public void b(long j17, aq.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onParseVideoSuccess >> mediaId: %d", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f247355a;
        galleryItem$LivePhotoMediaItem.C = u0Var.f12979e;
        galleryItem$LivePhotoMediaItem.D = u0Var.f12978d;
        galleryItem$LivePhotoMediaItem.F = u0Var.f12981g;
        galleryItem$LivePhotoMediaItem.E = u0Var.f12977c;
        galleryItem$LivePhotoMediaItem.G = 1;
        galleryItem$LivePhotoMediaItem.B = u0Var.f12980f;
        j33.d0.k(galleryItem$LivePhotoMediaItem.f138434i, galleryItem$LivePhotoMediaItem.f138430e, this.f247357c.f247513x, false, 0, true, galleryItem$LivePhotoMediaItem);
    }
}
