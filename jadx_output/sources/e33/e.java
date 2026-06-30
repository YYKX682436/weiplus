package e33;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f247206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f247207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247208g;

    public e(e33.b0 b0Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, long j17, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
        this.f247208g = b0Var;
        this.f247205d = galleryItem$MediaItem;
        this.f247206e = j17;
        this.f247207f = galleryItem$VideoMediaItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).Ai(com.tencent.mm.vfs.w6.n(this.f247205d.f138430e), this.f247206e, 3, 2, this.f247208g.f247138q, this.f247207f.f138446x / 1000);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
