package e33;

/* loaded from: classes10.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f247215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247216f;

    public f(e33.b0 b0Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, long j17) {
        this.f247216f = b0Var;
        this.f247214d = galleryItem$MediaItem;
        this.f247215e = j17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).wi(com.tencent.mm.vfs.w6.n(this.f247214d.f138430e), this.f247215e, 4, 1, this.f247216f.f247138q);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
