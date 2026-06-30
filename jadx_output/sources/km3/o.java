package km3;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.p f309249d;

    public o(km3.p pVar) {
        this.f309249d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        km3.p pVar = this.f309249d;
        km3.n nVar = pVar.f309255g;
        if (nVar != null) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = pVar.f309254f;
            kotlin.jvm.internal.o.d(galleryItem$VideoMediaItem);
            int i17 = galleryItem$VideoMediaItem.f138446x;
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem2 = pVar.f309254f;
            kotlin.jvm.internal.o.d(galleryItem$VideoMediaItem2);
            ((km3.l) nVar).a(pVar, i17, galleryItem$VideoMediaItem2.f138442t);
        }
    }
}
