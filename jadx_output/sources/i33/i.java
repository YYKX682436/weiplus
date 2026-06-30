package i33;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.LivePhotoUseStateEvent f288199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC f288200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent, com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC albumEventUIC) {
        super(0);
        this.f288199d = livePhotoUseStateEvent;
        this.f288200e = albumEventUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId: ");
        com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent = this.f288199d;
        sb6.append(livePhotoUseStateEvent.f54476g.f8566a);
        sb6.append(" isUseLivePhoto:");
        am.zi ziVar = livePhotoUseStateEvent.f54476g;
        sb6.append(ziVar.f8567b);
        sb6.append(" scene: ");
        sb6.append(ziVar.f8568c);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEventUIC", sb6.toString());
        com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC albumEventUIC = this.f288200e;
        albumEventUIC.getClass();
        if (ziVar.f8568c == 1) {
            androidx.appcompat.app.AppCompatActivity activity = albumEventUIC.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
            e33.b0 b0Var = ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) activity).f138528m;
            if (b0Var != null) {
                java.util.ArrayList arrayList = b0Var.f247130f;
                kotlin.jvm.internal.o.d(arrayList);
                java.util.Iterator it = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) next;
                    if (galleryItem$MediaItem.f138434i == ziVar.f8566a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEventUIC", "notifyMediaDataChange find it " + galleryItem$MediaItem.f138434i);
                        b0Var.notifyItemChanged(b0Var.z() + i17);
                        androidx.appcompat.app.AppCompatActivity activity2 = albumEventUIC.getActivity();
                        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
                        ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) activity2).R7();
                        break;
                    }
                    i17 = i18;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
