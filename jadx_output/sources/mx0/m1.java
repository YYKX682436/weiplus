package mx0;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.o1 f332149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f332150e;

    public m1(mx0.o1 o1Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        this.f332149d = o1Var;
        this.f332150e = galleryItem$MediaItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f332149d.c(this.f332150e);
    }
}
