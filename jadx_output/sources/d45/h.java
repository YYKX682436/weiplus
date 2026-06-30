package d45;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.i f226440d;

    public h(d45.i iVar) {
        this.f226440d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d45.i iVar = this.f226440d;
        d45.g gVar = iVar.f226445f;
        if (gVar != null) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = iVar.f226444e;
            kotlin.jvm.internal.o.d(galleryItem$VideoMediaItem);
            ((d45.e) gVar).a(iVar, galleryItem$VideoMediaItem.f138446x);
        }
    }
}
